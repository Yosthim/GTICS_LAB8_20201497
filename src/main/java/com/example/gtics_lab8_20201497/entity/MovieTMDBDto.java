package com.example.gtics_lab8_20201497.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class MovieTMDBDto {
    private boolean adult;
    private String backdrop_path;
    private List<Integer> genre_ids;
    private Integer id;
    private String original_language;
    private String original_title;
    private String overview;
    private BigDecimal popularity;
    private String poster_path;
    private LocalDate release_date;
    private String title;
    private boolean video;
    private float vote_average;
    private int vote_count;
}
