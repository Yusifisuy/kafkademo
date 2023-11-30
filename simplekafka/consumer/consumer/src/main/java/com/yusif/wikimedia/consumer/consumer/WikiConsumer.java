package com.yusif.wikimedia.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikiConsumer {

    @KafkaListener(topics = "wikimedia-stream", groupId = "myGroup")
    public void consumeMsg(String message) {
        log.info("MESSAGE CONSUMING :" + message);
    }
}