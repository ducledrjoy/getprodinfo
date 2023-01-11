package com.example.getofficenames.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "drugs")
public class Drug {

    @Id
    private String id;
    private String drugCode;
    private String productName;

}
