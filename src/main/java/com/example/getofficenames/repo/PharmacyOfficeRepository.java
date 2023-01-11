package com.example.getofficenames.repo;

import com.example.getofficenames.entity.PharmacyOffice;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmacyOfficeRepository extends MongoRepository<PharmacyOffice, String> {
}
