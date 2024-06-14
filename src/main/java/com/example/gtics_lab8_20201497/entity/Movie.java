package com.example.gtics_lab8_20201497.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @Column(name = "idMovies", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String overview;
    private BigDecimal popularity;
    private LocalDate releaseDate;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;
}
