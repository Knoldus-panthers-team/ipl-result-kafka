package com.knoldus.service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.knoldus.models.MatchResult;
import com.knoldus.repository.MatchResultRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ConsumerService {

    @Autowired
    MatchResultRepository repository;

    private final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @KafkaListener(topics = "iplResult", groupId = "group_id")
    public void consumeFromTopic(String message) throws IOException {
        System.out.println(message);
        logger.info(String.format("#### -> Consumed message -> %s", message));
        Gson gson = new Gson();
        JsonParser parser = new JsonParser();
        JsonObject object = (JsonObject) parser.parse(message);
        MatchResult matchResult = gson.fromJson(object,MatchResult.class);
        System.out.println("ok..............."+matchResult.getResult());
        repository.save(matchResult);
    }
}
