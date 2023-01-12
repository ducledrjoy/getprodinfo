package com.example.getofficenames.controller;

import com.example.getofficenames.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/get-prod")
    public Object getProdInfo(Pageable pageable){
        return productService.testQuery(pageable);
    }
}
