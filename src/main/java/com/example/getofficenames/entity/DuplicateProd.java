package com.example.getofficenames.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("duplicateProdName")
@Data
public class DuplicateProd {

    @Id
    private String id;
    private String name;
}
