//package com.knoldus.sender;
//
//import com.knoldus.models.MatchResult;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.List;
//import java.util.UUID;
//
//@Service
//public class Producer {
//    private static final Logger logger = LoggerFactory.getLogger(Producer.class);
//    private static final String TOPIC = "userkafka";
//
//    List<MatchResult> list= Arrays.asList(new MatchResult(),new MatchResult(), new MatchResult());
//
//    @Autowired
//    private KafkaTemplate<String, List<MatchResult>> kafkaTemplate;
//
//
//    public String sendMessage() {
////        logger.info(String.format("#### -> Producing message -> %s"));
////        this.kafkaTemplate.send(TOPIC, UUID.randomUUID().toString(),list);
////        this.kafkaTemplate.send(TOPIC, message);
//        return "Published Successfully";
//    }
//}
