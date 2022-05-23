package com.knoldus.repository;

import com.knoldus.models.MatchResult;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchResultRepository extends MongoRepository<MatchResult, Long> {
}
