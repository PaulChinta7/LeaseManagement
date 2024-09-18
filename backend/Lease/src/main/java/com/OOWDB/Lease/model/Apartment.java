package com.OOWDB.Lease.model;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "apartment")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Apartment {
    private String id;
    private String apartmentName;
    private String rent;
    private String address;
    private String banner;
    private String logo;
    private String insuranceId;
    
}
