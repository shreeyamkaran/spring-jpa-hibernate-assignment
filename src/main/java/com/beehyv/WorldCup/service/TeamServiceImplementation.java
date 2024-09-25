package com.beehyv.WorldCup.service;

import com.beehyv.WorldCup.entity.Team;
import com.beehyv.WorldCup.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImplementation implements TeamService {

    private final TeamRepository teamRepository;

    public TeamServiceImplementation(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public List<Team> fetchAllTeams() {
        return teamRepository.findAll();
    }

    @Override
    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public Team fetchTeam(Integer teamId) {
        return teamRepository.findById(teamId).orElse(null);
    }
}
