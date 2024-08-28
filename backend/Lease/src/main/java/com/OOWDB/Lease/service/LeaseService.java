package com.OOWDB.Lease.service;
import com.OOWDB.Lease.dto.HomeResponse;
import com.OOWDB.Lease.exception.UserNotFoundException;
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
    
    public ResponseEntity<HomeResponse> getHomeData(String id) {
        User fetched_user=userRepository.findById(id).orElseThrow(()->new UserNotFoundException("User Not Found in the database with id "+id));

        HomeResponse homeResponse= HomeResponse.builder()
                .name(fetched_user.getName())
                .email(fetched_user.getEmail())
                .build();
        return new ResponseEntity<>(homeResponse, HttpStatus.OK);
    }
}
