package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.*;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductsRepository;
import uk.ac.york.eng2.products.repository.TagsRepository;

import java.math.BigDecimal;
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

        System.out.println(productCreateDTO.getName());

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
        Map<String, Long> productQuantities = priceRequestDTO.getProductQuantities();

        // TODO: Apply offers to the response DTO

        OrderPriceResponseDTO priceResponseDTO = new OrderPriceResponseDTO();
        List<ProductPriceDTO> productPrices = new ArrayList<>();
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (String productName : productQuantities.keySet()) {
            Optional<Product> optProduct = productRepo.findByName(productName);
            if (optProduct.isEmpty()) return HttpResponse.notFound();
            Product product = optProduct.get();

            ProductPriceDTO productPriceDTO = new ProductPriceDTO();
            productPriceDTO.setProductId(product.getId());
            productPriceDTO.setProductName(product.getName());
            productPriceDTO.setUnitPrice(product.getUnitPrice());

            Long quantity = productQuantities.get(productName);
            BigDecimal linePrice = product.getUnitPrice().multiply(BigDecimal.valueOf(quantity));
            totalPrice = totalPrice.add(linePrice);
            productPrices.add(productPriceDTO);
        }

        priceResponseDTO.setProductPrices(productPrices);
        priceResponseDTO.setTotalPrice(totalPrice);

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
}
