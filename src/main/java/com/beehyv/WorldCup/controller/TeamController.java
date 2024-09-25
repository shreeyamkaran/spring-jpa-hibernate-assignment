package com.beehyv.WorldCup.controller;

import com.beehyv.WorldCup.entity.Team;
import com.beehyv.WorldCup.service.TeamService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/teams")
    public List<Team> fetchAllTeams() {
        return teamService.fetchAllTeams();
    }

    @PostMapping("/teams")
    public Team createTeam(@Valid @RequestBody Team team) {
        return teamService.createTeam(team);
    }

    @GetMapping("/teams/{team-id}")
    public Team fetchTeam(@PathVariable("team-id") Integer teamId) {
        return teamService.fetchTeam(teamId);
    }

}
