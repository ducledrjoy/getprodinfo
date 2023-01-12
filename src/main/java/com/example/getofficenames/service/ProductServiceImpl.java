package com.example.getofficenames.service;

import com.example.getofficenames.repo.AdvertisingPosterRepository;
import com.example.getofficenames.repo.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final AdvertisingPosterRepository advertisingPosterRepository;
    private final MongoTemplate mongoTemplate;
    private final ContactRepository contactRepository;

    public Object testQuery(Pageable pageable) {
        return contactRepository.findAll(pageable);
    }
}
