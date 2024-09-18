package com.OOWDB.Lease.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "utility")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Utility {
    private String id;
    private String utilityName;
    private String utilityPrice;
}
