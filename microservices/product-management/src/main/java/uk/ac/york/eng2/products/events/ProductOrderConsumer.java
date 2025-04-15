package uk.ac.york.eng2.products.events;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductsRepository;

import java.util.Optional;

@KafkaListener
public class ProductOrderConsumer {
    @Inject
    ProductsRepository productsRepo;

    @Inject
    OrdersByDayRepository ordersByDayRepo;

    @Transactional
    @Topic(ProductsTopicFactory.TOPIC_PRODUCT_ORDER)
    void orderPlaced(@KafkaKey long id, ProductOrderEvent productOrderEvent) {
        System.out.println("OrderPlaced: " + productOrderEvent);

        Optional<Product> optProduct = productsRepo.findById(id);
        if (optProduct.isEmpty()) {
            throw new IllegalArgumentException("No product found with id: " + id);
        }

        Product product = optProduct.get();
        Optional<OrdersByDay> optOrdersByDay = ordersByDayRepo.findByProductAndDay(product, productOrderEvent.date());

        if (optOrdersByDay.isPresent()) {
            OrdersByDay ordersByDay = optOrdersByDay.get();
            ordersByDay.setCount(ordersByDay.getCount() + productOrderEvent.quantity());
            ordersByDayRepo.save(ordersByDay);
        } else {
            OrdersByDay ordersByDay = new OrdersByDay();
            ordersByDay.setProduct(product);
            ordersByDay.setDay(productOrderEvent.date());
            ordersByDay.setCount(productOrderEvent.quantity());
            ordersByDayRepo.save(ordersByDay);
        }
    }
}
