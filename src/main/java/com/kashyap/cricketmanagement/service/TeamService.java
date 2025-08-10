package com.kashyap.cricketmanagement.service;

import com.kashyap.cricketmanagement.domain.Team;
import com.kashyap.cricketmanagement.repository.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TeamService {

    public Team saveTeam(Team team);

    public List<Team> getTeam();
}
