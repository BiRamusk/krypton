package com.infy.tele.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KryptonKafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(KryptonKafkaConsumer.class);
    private static final String TOPIC = "topic_krypton";

    @KafkaListener(topics = "topic_krypton", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consumed message in {} : {}", TOPIC, message);
    }
}
