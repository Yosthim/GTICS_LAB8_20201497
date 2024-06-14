package com.example.gtics_lab8_20201497.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MovieListDto {
    private DatesDto dates;
    private int pages;
    private List<MovieTMDBDto> results;
    private int total_pages;
    private int total_results;
}
