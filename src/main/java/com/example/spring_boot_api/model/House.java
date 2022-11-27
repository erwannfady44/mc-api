package com.example.spring_boot_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "House")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idHouse;

}
