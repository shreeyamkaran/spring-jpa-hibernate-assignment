package com.beehyv.WorldCup.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "players")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Player {

    @Id
    @GeneratedValue
    @Column(name = "player_id")
    private Integer id;

    @NotBlank
    @Column(name = "player_name")
    @Length(min = 3, max = 30)
    private String name;

    @ManyToOne
    @JoinColumn(name = "team_id")
    @JsonBackReference(value = "team_id")
    private Team team;

    @ManyToOne
    @JoinColumn(name = "role_id")
    @JsonBackReference(value = "role_id")
    private Role role;

    @OneToMany(mappedBy = "playerOfTheMatch", cascade = CascadeType.ALL)
    @JsonManagedReference(value = "player_of_the_match_id")
    private List<Result> gamesWithPlayerOfTheMatch;

}
