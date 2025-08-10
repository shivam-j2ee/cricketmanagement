package com.kashyap.cricketmanagement.repository;

import com.kashyap.cricketmanagement.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepo extends JpaRepository<Team,Long> {

    Team findByTeamName(String name);
}
