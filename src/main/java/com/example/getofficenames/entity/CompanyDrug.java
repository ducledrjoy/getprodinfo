package com.example.getofficenames.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "company_drugs")
public class CompanyDrug {
    @Id
    private String id;
    private String companyId;
    private String drugId;
}
