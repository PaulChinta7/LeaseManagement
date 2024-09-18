package com.OOWDB.Lease.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

@Document(collection = "invoice")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
    private String id;
    private String invoiceDocumentLink;
}
