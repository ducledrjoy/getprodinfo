package com.example.getofficenames.repo;

import com.example.getofficenames.entity.CompanyDrug;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDrugRepository extends MongoRepository<CompanyDrug,String> {
}
