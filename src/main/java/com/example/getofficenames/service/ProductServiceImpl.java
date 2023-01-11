package com.example.getofficenames.service;

import com.example.getofficenames.entity.CompanyDrug;
import com.example.getofficenames.entity.Drug;
import com.example.getofficenames.repo.CompanyDrugRepository;
import com.example.getofficenames.repo.DrugRepository;
import com.example.getofficenames.repo.PharmacyOfficeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final CompanyDrugRepository companyDrugRepository;
    private final DrugRepository drugRepository;
    private final PharmacyOfficeRepository pharmacyOfficeRepository;

    public void getProductInfo(){

        List<CompanyDrug> companyDrugList = companyDrugRepository.findAll();

        List<Drug> drugs = drugRepository.findAll();

    }
}
