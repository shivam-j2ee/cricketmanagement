package com.kashyap.cricketmanagement.controller;

import com.kashyap.cricketmanagement.domain.Team;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class TestController {

    @GetMapping("/")
    public ResponseEntity<String> getTeamDetails(HttpServletRequest request) {
        return new ResponseEntity<>("Test Api Successfull with session id :- " + request.getSession().getId(), HttpStatus.OK);
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
