package uk.ac.york.eng2.orders.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.orders.domain.Order;
import uk.ac.york.eng2.orders.domain.OrderItem;

@KafkaClient
public interface ProductOrderProducer {
    @Topic(OrdersTopicFactory.TOPIC_PRODUCT_ORDER)
    void productOrdered(@KafkaKey long id, ProductOrderEvent orderPlacementEvent);

    default void produceProductOrderEvents(Order order) {
        // Key the order product placements on productId to prevent ACID non-compliance on the consumers side
        for (OrderItem item : order.getOrderItems()) {
            ProductOrderEvent event = new ProductOrderEvent(item.getProductId(), order.getDateCreated());
            productOrdered(item.getProductId(), event);
        }
    }
}
