package com.OOWDB.Lease.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "maintanance")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Maintanance {
    private String id;
    List<Utility> utilityList;
}
