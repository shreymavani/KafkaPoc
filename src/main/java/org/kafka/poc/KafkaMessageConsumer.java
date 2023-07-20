package org.kafka.poc;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageConsumer {

    @KafkaListener(topics = "quickstart-events", groupId = "your_consumer_group21")
    public void receiveMessage(String message) {
        // Process the received message (e.g., print it)
        System.out.println("Received message: " + message);
    }
}
