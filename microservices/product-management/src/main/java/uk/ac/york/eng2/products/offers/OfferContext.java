package uk.ac.york.eng2.products.offers;

import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.resources.ProductsController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OfferContext {
    public static class IndividualProductOrder {
        public Product product;
        public BigDecimal currentPrice;

        public IndividualProductOrder(Product product) {
            this.product = product;
            currentPrice = this.product.getUnitPrice();
        }
    }

    private final ProductsController controller;
    public List<IndividualProductOrder> individualProductOrders;
    public BigDecimal totalPrice;

    public OfferContext(ProductsController controller) {
        this.controller = controller;
        individualProductOrders = new ArrayList<>();
        totalPrice = BigDecimal.ZERO;
    }

    public Long getOrderCountToday(String productName) {
        return controller.getTodaysOrderCount(productName);
    }
}
