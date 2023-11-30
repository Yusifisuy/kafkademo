package com.yusif.kafkademo.producer;

import com.yusif.kafkademo.model.People;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaProducer {

    private final KafkaTemplate<String, People> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, People> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    public void publishMessage(People people){
        Message<People> message = MessageBuilder
                .withPayload(people)
                .setHeader(KafkaHeaders.TOPIC,"yusif").build();

        kafkaTemplate.send(message);
        log.info("MESSAGE SENT to topic : " + message);
    }


}
