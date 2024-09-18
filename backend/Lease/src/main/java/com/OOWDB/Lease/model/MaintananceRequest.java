package com.OOWDB.Lease.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "maintanenceRequest")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MaintananceRequest {
    private String id;
    private LocalDateTime requestDate;
    private String request;
    private String status;
}
