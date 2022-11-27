package com.example.spring_boot_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Coordinate")
public class Coordinate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCoordinate;
    private Double x;
    private Double y;
    private Double z;
}
