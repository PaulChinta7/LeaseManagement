package com.OOWDB.Lease.controller;


import com.OOWDB.Lease.model.User;
import com.OOWDB.Lease.service.LeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class LeaseController {
    
    @Autowired
    LeaseService leaseService;
    
    @GetMapping("/home")
    public ResponseEntity<List<User>> getHomeData(){
        return leaseService.getHomeData();
    }
    
}
