package com.beehyv.WorldCup.service;

import com.beehyv.WorldCup.entity.Team;
import jakarta.validation.Valid;

import java.util.List;

public interface TeamService {

    List<Team> fetchAllTeams();

    Team createTeam(@Valid Team team);

    Team fetchTeam(Integer teamId);
}
