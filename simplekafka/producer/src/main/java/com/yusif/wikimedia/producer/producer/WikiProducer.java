package com.yusif.wikimedia.producer.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikiProducer {

    private final KafkaTemplate<String,String> kafkaTemplate;

    public WikiProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publishMessage(String message){
        log.info("MESSAGE QUEUED :" +message );
        kafkaTemplate.send("wikimedia-topic",message);
    }


}
