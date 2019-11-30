package com.example.demo.repo;

import com.example.demo.domain.LanguageMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageMongoRepo extends MongoRepository<LanguageMongo, String> {
}
