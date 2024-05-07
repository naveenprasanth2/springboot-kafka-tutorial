package net.javaguides.springbootkafkatutorial.kafka;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.javaguides.springbootkafkatutorial.payload.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class JsonKafkaConsumer {

    @KafkaListener(topics = "javaGuides_json", groupId = "myGroup2")
    public void consumeJson(User user){
        log.info("inside consumeJson");
        log.info("Message received in consumer 1 -> {}", user);
    }

}
