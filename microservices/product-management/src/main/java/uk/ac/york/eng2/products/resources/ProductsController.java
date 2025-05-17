package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import jakarta.persistence.Tuple;
import jakarta.transaction.Transactional;
import org.flywaydb.core.internal.util.Pair;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.*;
import uk.ac.york.eng2.products.offers.OfferContext;
import uk.ac.york.eng2.products.offers.OfferEngine;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductsRepository;
import uk.ac.york.eng2.products.repository.TagsRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

@io.swagger.v3.oas.annotations.tags.Tag(name = "Products")
@Controller(ProductsController.PREFIX)
public class ProductsController {
    public static final String PREFIX = "/products";

    @Inject
    private ProductsRepository productRepo;

    @Inject
    private OrdersByDayRepository ordersByDayRepo;

    @Inject
    private TagsRepository tagsRepo;

    @Inject
    private OfferEngine offerEngine;

    @Get
    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    @Get("/{id}")
    public HttpResponse<Product> getProduct(@PathVariable Long id) {
        Optional<Product> optProduct = productRepo.findById(id);
        if (optProduct.isEmpty()) return HttpResponse.notFound();
        return HttpResponse.ok(optProduct.get());
    }

    @Post("/daily/{id}")
    public HttpResponse<OrdersByDay> getProductDailyOrders(@PathVariable Long id, @Body OrdersByDayRequestDTO ordersByDayRequestDTO) {
        Optional<Product> optProduct = productRepo.findById(id);
        if (optProduct.isEmpty()) return HttpResponse.notFound();
        Product product = optProduct.get();

        Optional<OrdersByDay> optOrdersByDay = ordersByDayRepo.findByProductAndDay(product, ordersByDayRequestDTO.getDay());
        if (optOrdersByDay.isEmpty()) return HttpResponse.notFound();
        return HttpResponse.ok(optOrdersByDay.get());
    }

    @Transactional
    @Post
    public HttpResponse<Product> createProduct(@Body ProductCreateDTO productCreateDTO) {
        if (productRepo.existsByName(productCreateDTO.getName())) {
            return HttpResponse.status(HttpStatus.CONFLICT);
        }

        Product product = new Product();
        product.setName(productCreateDTO.getName());
        product.setUnitPrice(productCreateDTO.getUnitPrice());
        product = productRepo.save(product);

        Set<Tag> tags = getTags(productCreateDTO.getTags());
        product.setTags(tags);
        product = productRepo.save(product);

        return HttpResponse.created(product);
    }

    @Transactional
    @Put("/{id}")
    public HttpResponse<Product> updateProduct(@PathVariable Long id, @Body ProductUpdateDTO productUpdateDTO) {
        Optional<Product> optProduct = productRepo.findById(id);
        if (optProduct.isEmpty()) return HttpResponse.notFound();
        Product product = optProduct.get();

        product.setUnitPrice(productUpdateDTO.getUnitPrice());
        Set<Tag> tags = getTags(productUpdateDTO.getTags());
        product.setTags(tags);
        productRepo.save(product);

        return HttpResponse.ok(product);
    }

    @Delete("/{id}")
    public HttpResponse<Void> deleteProduct(@PathVariable Long id) {
        if (!productRepo.existsById(id)) return HttpResponse.notFound();
        productRepo.deleteById(id);
        return HttpResponse.noContent();
    }

    @Transactional
    @Put("/order")
    public HttpResponse<OrderPriceResponseDTO> priceOrder(@Body OrderPriceRequestDTO priceRequestDTO) {
        OfferContext ctx = new OfferContext(this);
        Map<String, Long> productQuantities = priceRequestDTO.getProductQuantities();
        Map<String, Product> products = new HashMap<String, Product>();

        // Put the price request product names into an offer context
        for (String productName : productQuantities.keySet()) {
            Optional<Product> optProduct = productRepo.findByName(productName);
            if (optProduct.isEmpty()) return HttpResponse.notFound();
            Product product = optProduct.get();
            products.put(productName, product);
            for (int i = 0; i < productQuantities.get(productName); i++) {
                ctx.productOrders.add(new OfferContext.ProductOrder(product));
            }
        }

        offerEngine.applyOffers(ctx);

        System.out.println("PM Price after: " + ctx.totalPrice);

        // Collate an ordered list of product unit prices from the ctx
        List<ProductPriceDTO> productPrices = new ArrayList<>();
        for (String productName : productQuantities.keySet()) {
            ProductPriceDTO productPriceDTO = new ProductPriceDTO();
            Product product = products.get(productName);
            productPriceDTO.setProductId(product.getId());
            productPriceDTO.setUnitPrice(product.getUnitPrice());
            productPriceDTO.setProductName(product.getName());
            productPrices.add(productPriceDTO);
        }

        // Respond with final unit and total prices from the ctx
        OrderPriceResponseDTO priceResponseDTO = new OrderPriceResponseDTO();
        priceResponseDTO.setProductPrices(productPrices);
        priceResponseDTO.setTotalPrice(ctx.totalPrice);
        return HttpResponse.ok(priceResponseDTO);
    }

    private Set<Tag> getTags(Set<String> tagNames) {
        Set<Tag> tags = new HashSet<>();

        for (String tagName : tagNames) {
            Tag tag = tagsRepo.findByName(tagName).orElse(null);

            if (tag == null) {
                tag = new Tag();
                tag.setName(tagName);
                tag = tagsRepo.save(tag);
            }

            tags.add(tag);
        }

        return tags;
    }

    public Long getTodaysOrderCount(String productName) {
        Optional<Product> optProduct = productRepo.findByName(productName);
        if (optProduct.isEmpty()) return 0L;
        Product product = optProduct.get();

        Optional<OrdersByDay> todayOrdersOpt = ordersByDayRepo.findByProductAndDay(product, LocalDate.now());
        if (todayOrdersOpt.isEmpty()) return 0L;
        OrdersByDay todayOrders = todayOrdersOpt.get();

        return todayOrders.getCount();
    }
}
