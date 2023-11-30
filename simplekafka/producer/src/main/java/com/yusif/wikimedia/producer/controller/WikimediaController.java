package com.yusif.wikimedia.producer.controller;

import com.yusif.wikimedia.producer.stream.WikimediaStreamConsumer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/wikimedia")
public class WikimediaController {

    private final WikimediaStreamConsumer streamConsumer;

    public WikimediaController(WikimediaStreamConsumer streamConsumer) {
        this.streamConsumer = streamConsumer;
    }

    @GetMapping
    public void startPublishing() {
        streamConsumer.consumeStreamAndPublish();
    }
}