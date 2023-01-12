package com.example.getofficenames.repo;

import com.example.getofficenames.entity.DuplicateProd;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DuplicateProdRepository extends MongoRepository<DuplicateProd,String> {

    void deleteByNameNotIn(List<String> duplicatedNames);
}
