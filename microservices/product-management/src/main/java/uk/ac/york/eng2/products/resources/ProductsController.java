package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.ProductCreateDTO;
import uk.ac.york.eng2.products.repository.ProductsRepository;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Controller("/products")
public class ProductsController {
    @Inject
    ProductsRepository repo;

    @Post
    public HttpResponse<Void> createProduct(@Body ProductCreateDTO productCreateDTO) {
        Product product = new Product();
        product.setName(productCreateDTO.getName());
        product.setUnitPrice(productCreateDTO.getUnitPrice());

        product = repo.save(product);
        return HttpResponse.created(URI.create("/products/" + product.getId()));
    }

    @Get
    public List<Product> getProducts() {
        return repo.findAll();
    }

    @Get("/{id}")
    public Product getProduct(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @Transactional
    @Put("/{id}")
    public void updateProduct(@PathVariable Long id, @RequestBody ProductCreateDTO productCreateDTO) {
        Optional<Product> oProduct = repo.findById(id);
        if (oProduct.isEmpty()) throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");

        Product product = oProduct.get();
        product.setName(productCreateDTO.getName());
        product.setUnitPrice(productCreateDTO.getUnitPrice());
        repo.save(product);
    }

    @Delete("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        if (!repo.existsById(id)) throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        repo.deleteById(id);
    }
}
