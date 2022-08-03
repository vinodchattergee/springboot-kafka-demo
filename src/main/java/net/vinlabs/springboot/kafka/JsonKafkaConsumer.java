package net.vinlabs.springboot.kafka;

import net.vinlabs.springboot.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
    @KafkaListener(topics = "${spring.kafka.topic-json.name}", groupId = "myGroup")
    public void consume(User message) {
        LOGGER.info(String.format("Json Message received %s", message.toString()));
    }
}
