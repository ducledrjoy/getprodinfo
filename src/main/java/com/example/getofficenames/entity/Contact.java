package com.example.getofficenames.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("contact")
@Data
public class Contact {
    @Id
    private String id;
    private String _class;
    private String created;
    private String creator;
    private String updated;
    private String updater;
    private String address1;
    private String address2;
    private String cityId;
    private String phoneNo;
    private String postalCode;
    private String prefectureCode;
}
