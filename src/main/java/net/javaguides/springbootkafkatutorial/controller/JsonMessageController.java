package net.javaguides.springbootkafkatutorial.controller;

import lombok.AllArgsConstructor;
import net.javaguides.springbootkafkatutorial.kafka.JsonKafkaProducer;
import net.javaguides.springbootkafkatutorial.payload.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
@AllArgsConstructor
public class JsonMessageController {
    private final JsonKafkaProducer jsonKafkaProducer;

    @PostMapping("/publish/json")
    public ResponseEntity<String> publish(@RequestBody User user) {
        jsonKafkaProducer.sendMessage(user);
        return new ResponseEntity<>("Message is sent to the consumer", HttpStatus.OK);
    }

}
