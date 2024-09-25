package com.beehyv.WorldCup.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Entity
@Table(name = "teams")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Team {

    @Id
    @GeneratedValue
    @Column(name = "team_id")
    private Integer id;

    @NotBlank
    @Column(name = "team_name")
    @Length(min = 3, max = 30)
    private String name;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    @JsonManagedReference(value = "team_id")
    private List<Player> players;

    @OneToMany(mappedBy = "team1", cascade = CascadeType.ALL)
    @JsonManagedReference(value = "team1_id")
    private List<Game> gamesAsTeam1;

    @OneToMany(mappedBy = "team2", cascade = CascadeType.ALL)
    @JsonManagedReference(value = "team2_id")
    private List<Game> gamesAsTeam2;

    @OneToMany(mappedBy = "winner", cascade = CascadeType.ALL)
    @JsonManagedReference(value = "winning_team_id")
    private List<Result> winningList;

    @OneToMany(mappedBy = "loser", cascade = CascadeType.ALL)
    @JsonManagedReference(value = "losing_team_id")
    private List<Result> losingList;

}
