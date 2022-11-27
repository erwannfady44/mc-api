package com.example.spring_boot_api.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name="player")
@Getter
@Setter
@NoArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long playerId;
    @ManyToMany()
    @JoinTable(
            name = "player_grade",
            joinColumns = @JoinColumn(name = "idPlayer"),
            inverseJoinColumns = @JoinColumn(name = "idGrade"))
    Set<Grade> grades;
    @Column(unique=true)
    private String pseudo;
    private String password;
}
