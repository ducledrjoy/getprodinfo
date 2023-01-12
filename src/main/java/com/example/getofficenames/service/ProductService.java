package com.example.getofficenames.service;


import org.springframework.data.domain.Pageable;

public interface ProductService {
    Object testQuery(Pageable pageable);
}
