package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.*;
import uk.ac.york.eng2.products.repository.ProductsRepository;
import uk.ac.york.eng2.products.repository.TagsRepository;

import java.math.BigDecimal;
import java.util.*;

@io.swagger.v3.oas.annotations.tags.Tag(name = "Products")
@Controller("/products")
public class ProductsController {
    @Inject
    private ProductsRepository productRepo;

    @Inject
    private TagsRepository tagsRepo;

    @Get
    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    @Get("/{id}")
    public Product getProduct(@PathVariable Long id) {
        return productRepo.findById(id).orElse(null);
    }

    @Transactional
    @Post
    public Product createProduct(@Body ProductCreateDTO productCreateDTO) {
        if (productRepo.existsByName(productCreateDTO.getName())) {
            throw new HttpStatusException(HttpStatus.CONFLICT, "Product name already exists");
        }

        Product product = new Product();
        product.setName(productCreateDTO.getName());
        product.setUnitPrice(productCreateDTO.getUnitPrice());
        product = productRepo.save(product);

        Set<Tag> tags = getTags(productCreateDTO.getTags());
        product.setTags(tags);
        return productRepo.save(product);
    }

    @Transactional
    @Put("/{id}")
    public Product updateProduct(@Body ProductUpdateDTO productUpdateDTO, @PathVariable Long id) {
        Optional<Product> optProduct = productRepo.findById(id);
        if (optProduct.isEmpty()) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }

        Product product = optProduct.get();
        product.setUnitPrice(productUpdateDTO.getUnitPrice());
        Set<Tag> tags = getTags(productUpdateDTO.getTags());
        product.setTags(tags);
        productRepo.save(product);

        return product;
    }

    @Delete("/{id}")
    public HttpResponse<Void> deleteProduct(@PathVariable Long id) {
        if (!productRepo.existsById(id)) return HttpResponse.notFound();
        productRepo.deleteById(id);
        return HttpResponse.noContent();
    }

    @Transactional
    @Put("/order")
    public OrderResponseDTO calculateOrder(@Body OrderRequestDTO requestDTO) {
        Map<String, Long> productQuantities = requestDTO.getProductQuantities();

        // TODO: Apply offers to the response DTO

        OrderResponseDTO responseDTO = new OrderResponseDTO();
        List<ProductPriceDTO> productPrices = new ArrayList<>();
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (String productName : productQuantities.keySet()) {
            Optional<Product> optProduct = productRepo.findByName(productName);
            if (optProduct.isEmpty()) throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
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

        responseDTO.setProductPrices(productPrices);
        responseDTO.setTotalPrice(totalPrice);

        return responseDTO;
    }

    private Set<Tag> getTags(Set<String> tagNames) {
        Set<Tag> tags = new HashSet<>();

        for (String tagName : tagNames) {
            Optional<Tag> optTag = tagsRepo.findByName(tagName);
            if (optTag.isPresent()) {
                tags.add(optTag.get());
            } else {
                Tag tag = new Tag();
                tag.setName(tagName);
                tag = tagsRepo.save(tag);
                tags.add(tag);
            }
        }

        return tags;
    }
}
