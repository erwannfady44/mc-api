package com.example.spring_boot_api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "GRADE")
@Getter
@Setter
@NoArgsConstructor
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idGrade;
    @Column(unique=true)
    private String name;
    @ManyToMany(mappedBy = "grades")
    Set<Player> players;
    @ManyToMany()
    @JoinTable(
            name = "grade_permission",
            joinColumns = @JoinColumn(name = "idGrade"),
            inverseJoinColumns = @JoinColumn(name = "idPermission"))
    Set<Permission> permissions;
}
