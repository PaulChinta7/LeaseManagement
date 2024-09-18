package com.OOWDB.Lease.model;


import lombok.*;
import org.springframework.cglib.core.Local;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "payment")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Payment {
    private String id;
    private String paymentAmount;
    private String type;
    private LocalDateTime paymentDate;
}
