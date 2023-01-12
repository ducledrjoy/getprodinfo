package com.example.getofficenames.repo;

import com.example.getofficenames.entity.AdvertisingPoster;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertisingPosterRepository extends MongoRepository<AdvertisingPoster,String> {
}
