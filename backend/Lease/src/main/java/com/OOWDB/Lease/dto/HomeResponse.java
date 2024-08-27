package com.OOWDB.Lease.dto;

import lombok.*;

@Data
@Getter
@Setter
@Builder
public class HomeResponse {
    private String name;
    private String email;
    private String apartmentId;
}
