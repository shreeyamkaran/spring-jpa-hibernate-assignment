package com.beehyv.WorldCup.controller;

import com.beehyv.WorldCup.entity.Player;
import com.beehyv.WorldCup.service.PlayerService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public List<Player> fetchAllPlayers() {
        return playerService.fetchAllPlayers();
    }

    @PostMapping("/players")
    public Player createPlayer(@Valid @RequestBody Player player) {
        return playerService.createPlayer(player);
    }

    @GetMapping("/players/{player-id}")
    public Player fetchPlayer(@PathVariable("player-id") Integer playerId) {
        return playerService.fetchPlayer(playerId);
    }

}
