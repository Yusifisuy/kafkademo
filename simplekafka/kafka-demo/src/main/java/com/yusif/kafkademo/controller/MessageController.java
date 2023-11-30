package com.yusif.kafkademo.controller;

import com.yusif.kafkademo.model.People;
import com.yusif.kafkademo.producer.KafkaProducer;

import org.springframework.http.ResponseEntity;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
public class MessageController {

    private final KafkaProducer kafkaProducer;


    public MessageController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }


    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody People people){

        kafkaProducer.publishMessage(people);
        return ResponseEntity.ok("Message successfully sagoladi");
    }
}
