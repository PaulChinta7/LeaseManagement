package com.OOWDB.Lease.service;

import com.OOWDB.Lease.model.User;
import com.OOWDB.Lease.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaseService {

    @Autowired
    UserRepository userRepository;
    
    public ResponseEntity<List<User>> getHomeData() {
        List<User> fetched_users=userRepository.findAll();
        return new ResponseEntity<>(fetched_users, HttpStatus.OK);
    }
}
