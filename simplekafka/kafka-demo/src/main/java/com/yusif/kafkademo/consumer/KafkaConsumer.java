package com.yusif.kafkademo.consumer;

import com.yusif.kafkademo.model.People;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {


    @KafkaListener(topics = "yusif",groupId = "myGroup")
    public void consumeMessage(People people){
        log.info("CAMAAT SAGOLANIR :" + people);
    }
}
