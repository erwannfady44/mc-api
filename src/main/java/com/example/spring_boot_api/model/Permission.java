package com.example.spring_boot_api.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Permission")
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPermission;
    @ManyToMany(mappedBy = "permissions")
    Set<Grade> grades;
    @Column(unique=true)
    private String name;
}
