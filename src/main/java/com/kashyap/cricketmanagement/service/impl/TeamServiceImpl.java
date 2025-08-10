package com.kashyap.cricketmanagement.service.impl;

import com.kashyap.cricketmanagement.domain.Team;
import com.kashyap.cricketmanagement.dto.SaveResponseDTO;
import com.kashyap.cricketmanagement.repository.TeamRepo;
import com.kashyap.cricketmanagement.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamRepo teamRepo;

    public static void main(String[] arg){
        int arr[] = new int[] {0,1,2,3,4,5,6,7,9};
        int target = 9;
        System.out.println(getPair(arr, target));
    }

    private static Map<Integer, Integer> getPair(int arr[], int target){
        Map<Integer, Integer> pair = new HashMap<>();
        for(int j = 0; j < arr.length; j++) {
            int delta = target - arr[j];// 8 , 1
            if(Objects.nonNull(pair.get(delta))){// false, true
                pair.replace(delta, arr[j]); //(1, 8)
            } else {
                pair.put(arr[j], 0); //(1, 0)
            }

        }
        return pair.entrySet().stream().filter(e -> !Objects.equals(0, e.getValue())).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
    }

    @Override
    public Team saveTeam(Team team) {

        Team existingTeam = teamRepo.findByTeamName(team.getTeamName());
        if(Objects.isNull(existingTeam)){
          //  SaveResponseDTO
            return null;
        }
        return null;
    }

    public List<Team> getTeam(){
        return teamRepo.findAll();
    }

}
