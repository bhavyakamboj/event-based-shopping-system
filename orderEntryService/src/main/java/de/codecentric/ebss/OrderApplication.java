package de.codecentric.ebss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.config.EnableIntegration;

@EnableIntegration
@SpringBootApplication
public class OrderApplication {

    public static final String ORDER_CREATED_EVENT = "OrderCreatedEvent";

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}