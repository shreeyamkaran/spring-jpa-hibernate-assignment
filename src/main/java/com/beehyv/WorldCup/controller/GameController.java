package com.beehyv.WorldCup.controller;

import com.beehyv.WorldCup.entity.Game;
import com.beehyv.WorldCup.service.GameService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/games")
    public List<Game> fetchAllGames() {
        return gameService.fetchAllGames();
    }

    @PostMapping("/games")
    public Game createGame(@Valid @RequestBody Game game) {
        return gameService.createGame(game);
    }

    @GetMapping("/games/{game-id}")
    public Game fetchGame(@PathVariable("game-id") Integer gameId) {
        return gameService.fetchGame(gameId);
    }

}
