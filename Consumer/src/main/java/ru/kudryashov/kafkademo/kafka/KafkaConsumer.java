package ru.kudryashov.kafkademo.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "kafkaSpringApi", groupId = "demo")
    public void listener(ConsumerRecord<String, String> record) {
        System.out.println(record.value());
    }

}
