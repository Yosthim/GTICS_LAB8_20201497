package com.example.gtics_lab8_20201497.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "idusers", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    private String name;
    private String email;
    private String password;
    private boolean active;
}
