//package com.knoldus.Deserializer;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.knoldus.models.MatchResult;
//import org.apache.kafka.common.serialization.Deserializer;
//
//public class MatchResultDeserializer implements Deserializer<MatchResult> {
//    @Override
//    public MatchResult deserialize(String s, byte[] bytes) {
//        ObjectMapper objectMapper = new ObjectMapper();
//        MatchResult result = null;
//        try {
//            result = objectMapper.readValue(bytes, MatchResult.class);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
//}
