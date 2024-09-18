package com.OOWDB.Lease.model;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lease")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Lease {
    private String id;
    private String apartmentId;
    private String contractId;
    
}
