package com.beehyv.WorldCup.service;

import com.beehyv.WorldCup.entity.Player;
import jakarta.validation.Valid;

import java.util.List;

public interface PlayerService {

    List<Player> fetchAllPlayers();

    Player createPlayer(@Valid Player player);

    Player fetchPlayer(Integer playerId);
}
