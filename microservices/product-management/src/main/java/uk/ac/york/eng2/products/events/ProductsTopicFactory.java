package uk.ac.york.eng2.products.events;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Requires;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.NewTopic;

@Requires(bean = AdminClient.class)
@Factory
public class ProductsTopicFactory {

    public static final String TOPIC_PRODUCT_ORDER = "product_order";

    @Bean
    NewTopic orderPlacementsTopic() {
        return new NewTopic(TOPIC_PRODUCT_ORDER, 1, (short) 1);
    }
}
