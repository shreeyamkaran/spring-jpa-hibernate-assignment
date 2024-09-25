package com.beehyv.WorldCup.service;

import com.beehyv.WorldCup.entity.Player;
import com.beehyv.WorldCup.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImplementation implements PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerServiceImplementation(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public List<Player> fetchAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Player fetchPlayer(Integer playerId) {
        return playerRepository.findById(playerId).orElse(null);
    }
}
