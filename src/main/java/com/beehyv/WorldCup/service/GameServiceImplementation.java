package com.beehyv.WorldCup.service;

import com.beehyv.WorldCup.entity.Game;
import com.beehyv.WorldCup.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImplementation implements GameService {

    private final GameRepository gameRepository;

    public GameServiceImplementation(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public List<Game> fetchAllGames() {
        return gameRepository.findAll();
    }

    @Override
    public Game createGame(Game game) {
        return gameRepository.save(game);
    }

    @Override
    public Game fetchGame(Integer gameId) {
        return gameRepository.findById(gameId).orElse(null);
    }
}
