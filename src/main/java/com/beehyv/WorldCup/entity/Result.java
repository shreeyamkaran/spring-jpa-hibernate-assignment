package com.beehyv.WorldCup.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "results")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Result {

    @Id
    @GeneratedValue
    @Column(name = "result_id")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "game_id")
    @JsonBackReference(value = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "winning_team_id")
    @JsonBackReference(value = "winning_team_id")
    private Team winner;

    @ManyToOne
    @JoinColumn(name = "losing_team_id")
    @JsonBackReference(value = "losing_team_id")
    private Team loser;

    @ManyToOne
    @JoinColumn(name = "player_of_the_match_id")
    @JsonBackReference(value = "player_of_the_match_id")
    private Player playerOfTheMatch;

}
