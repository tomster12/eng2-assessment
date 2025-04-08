package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.OrderRequestDTO;
import uk.ac.york.eng2.products.dto.OrderResponseDTO;
import uk.ac.york.eng2.products.dto.ProductCreateDTO;
import uk.ac.york.eng2.products.dto.ProductUpdateDTO;
import uk.ac.york.eng2.products.repository.ProductsRepository;
import uk.ac.york.eng2.products.repository.TagsRepository;

import java.math.BigDecimal;
import java.net.URI;
import java.util.*;

@Controller("/products")
public class ProductsController {
    @Inject
    ProductsRepository productRepo;

    @Inject
    TagsRepository tagsRepo;

    @Transactional
    @Get
    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    @Transactional
    @Get("/{id}")
    public Product getProduct(@PathVariable Long id) {
        return productRepo.findById(id).orElse(null);
    }

    @Transactional
    @Post
    public HttpResponse<Void> createProduct(@Body ProductCreateDTO productCreateDTO) {
        if (productRepo.existsByName(productCreateDTO.getName())) return HttpResponse.status(HttpStatus.CONFLICT);

        Product product = new Product();
        product.setName(productCreateDTO.getName());
        product.setUnitPrice(productCreateDTO.getUnitPrice());
        product = productRepo.save(product);

        Set<Tag> tags = getTags(productCreateDTO.getTags());
        product.setTags(tags);
        productRepo.save(product);

        return HttpResponse.created(URI.create("/products/" + product.getId()));
    }

    @Transactional
    @Put("/{id}")
    public HttpResponse<Void> updateProduct(@Body ProductUpdateDTO productUpdateDTO, @PathVariable Long id) {
        Optional<Product> optProduct = productRepo.findById(id);
        if (optProduct.isEmpty()) throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");

        Product product = optProduct.get();
        product.setUnitPrice(productUpdateDTO.getUnitPrice());
        Set<Tag> tags = getTags(productUpdateDTO.getTags());
        product.setTags(tags);
        productRepo.save(product);

        return HttpResponse.ok();
    }

    @Delete("/{id}")
    public HttpResponse<Void> deleteProduct(@PathVariable Long id) {
        if (!productRepo.existsById(id)) throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        productRepo.deleteById(id);
        return HttpResponse.ok();
    }

    @Transactional
    @Put("/order")
    public OrderResponseDTO calculateOrder(@Body OrderRequestDTO requestDTO) {
        OrderResponseDTO responseDTO = new OrderResponseDTO();
        Map<Long, Integer> productQuantities = requestDTO.getProductQuantities();
        Map<Long, BigDecimal> productPrices = new HashMap<>();
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Long productId : productQuantities.keySet()) {
            Optional<Product> optProduct = productRepo.findById(productId);
            if (optProduct.isEmpty()) throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
            Product product = optProduct.get();

            BigDecimal linePrice = product.getUnitPrice().multiply(BigDecimal.valueOf(productQuantities.get(productId)));
            productPrices.put(productId, linePrice);
            totalPrice = totalPrice.add(linePrice);
        }

        responseDTO.setItemPrices(productPrices);
        responseDTO.setTotalPrice(totalPrice);

        // TODO: Apply offers to the response DTO

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
