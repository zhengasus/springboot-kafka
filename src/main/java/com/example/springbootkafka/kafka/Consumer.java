package com.example.springbootkafka.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author xu
 * @date 2019-7-3
 */
@Component
@Slf4j
public class Consumer {

    @KafkaListener(groupId = "demo", topics = "topic.demo")
    public void listen(ConsumerRecord<?, ?> record) {
        log.info("topic = {}, offset = {}, value = {}", record.topic(), record.offset(), record.value());
    }
}
