package uk.ac.york.eng2.products.offers;

import org.flywaydb.core.internal.util.Pair;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.resources.ProductsController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OfferContext {
    public static class ProductOrder {
        public Product product;
        public BigDecimal currentPrice;

        public ProductOrder(Product product) {
            this.product = product;
            currentPrice = this.product.getUnitPrice();
        }
    }

    private ProductsController controller;
    public List<ProductOrder> productOrders;
    public BigDecimal totalPrice;

    public OfferContext(ProductsController controller) {
        this.controller = controller;
        productOrders = new ArrayList<>();
        totalPrice = BigDecimal.ZERO;
    }

    public Long getTodaysOrderCount(String productName) {
        return controller.getTodaysOrderCount(productName);
    }
}
