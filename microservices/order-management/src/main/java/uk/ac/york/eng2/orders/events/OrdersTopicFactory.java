package uk.ac.york.eng2.orders.events;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Requires;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.NewTopic;

@Requires(bean = AdminClient.class)
@Factory
public class OrdersTopicFactory {

    public static final String TOPIC_PRODUCT_ORDER = "product_order";

    @Bean
    NewTopic productOrderTopic() {
        return new NewTopic(TOPIC_PRODUCT_ORDER, 3, (short) 3);
    }
}
