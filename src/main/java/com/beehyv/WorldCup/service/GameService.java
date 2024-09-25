package com.beehyv.WorldCup.service;

import com.beehyv.WorldCup.entity.Game;
import jakarta.validation.Valid;

import java.util.List;

public interface GameService {

    List<Game> fetchAllGames();

    Game createGame(@Valid Game game);

    Game fetchGame(Integer gameId);
}
