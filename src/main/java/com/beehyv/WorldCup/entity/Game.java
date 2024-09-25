package com.beehyv.WorldCup.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "games")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Game {

    @Id
    @GeneratedValue
    @Column(name = "game_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "team1_id")
    @JsonBackReference(value = "team1_id")
    private Team team1;

    @ManyToOne
    @JoinColumn(name = "team2_id")
    @JsonBackReference(value = "team2_id")
    private Team team2;

    @OneToOne(mappedBy = "game", cascade = CascadeType.ALL)
    @JsonManagedReference(value = "game_id")
    private Result result;

}
