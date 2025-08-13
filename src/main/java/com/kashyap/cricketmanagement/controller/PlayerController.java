package com.kashyap.cricketmanagement.controller;

import com.kashyap.cricketmanagement.dto.PlayerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/player")
public class PlayerController {

    private List<PlayerDTO> players = new ArrayList<>(List.of(
            new PlayerDTO(1L, "Sachin Tendulkar", 100),
            new PlayerDTO(2L, "Virat Kohli", 75),
            new PlayerDTO(3L, "Rohit Sharma", 80),
            new PlayerDTO(4L, "MS Dhoni", 90)));

    @GetMapping("/players")
    public List<PlayerDTO> getPlayers() {

        return players;
    }

    @PostMapping("/players")
    public List<PlayerDTO> savePlayers(@RequestBody PlayerDTO playerDTO) {
        players.add(playerDTO);
        return players;
    }
}
