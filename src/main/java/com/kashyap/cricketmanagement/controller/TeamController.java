package com.kashyap.cricketmanagement.controller;

import com.kashyap.cricketmanagement.domain.Team;
import com.kashyap.cricketmanagement.service.TeamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cricketmanagement")
public class TeamController {
    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TeamService teamService;

    @GetMapping("/teamDetail")
    public ResponseEntity<List<Team>> getTeamDetails(){
        logger.info("team controller called");
        return new ResponseEntity<>(teamService.getTeam(), HttpStatus.OK);
    }



}
