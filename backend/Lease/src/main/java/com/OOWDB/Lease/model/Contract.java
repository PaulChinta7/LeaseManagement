package com.OOWDB.Lease.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "contract")
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Contract {
    private String id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime tenure;
    private String contractDocumentLink;
    private List<Maintanance> maintanenceList;
    private List<MaintananceRequest> maintanenceRequestList;
    private List<Payment> paymentsList;
    private List<Invoice> invoiceList;
}
