package com.kashyap.cricketmanagement.controller;

import com.kashyap.cricketmanagement.domain.Team;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class TestController {

    @GetMapping()
    public ResponseEntity<String> getTeamDetails(){
        return new ResponseEntity<>("Test Api Successfull", HttpStatus.OK);
    }
}
