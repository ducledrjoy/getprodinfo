package com.example.getofficenames.repo;

import com.example.getofficenames.entity.Drug;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrugRepository extends MongoRepository<Drug, String> {
    void deleteByProductNameNotIn(List<String> duplicatedNames);
}
