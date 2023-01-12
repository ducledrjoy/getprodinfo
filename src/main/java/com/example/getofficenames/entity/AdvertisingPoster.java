package com.example.getofficenames.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("advertising_posters")
public class AdvertisingPoster {
    @Id
    private String id;
    private String name;
    private String _class;
    private String displayOrder;
    private String filePath;
    private String title;
    private String uploaded;
    private String updater;
}
