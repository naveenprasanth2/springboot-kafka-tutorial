package net.javaguides.springbootkafkatutorial.kafka;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class KafkaConsumer {
    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "myGroup")
    public void consume(String message){
        log.info("inside consume");
        log.info("Message received in consumer -> {}", message);
    }

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "myGroup1")
    public void consume1(String message){
        log.info("inside consume1");
        log.info("Message received in consumer 1 -> {}", message);
    }
}
