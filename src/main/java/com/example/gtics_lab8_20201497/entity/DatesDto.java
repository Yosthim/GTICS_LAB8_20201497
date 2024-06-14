package com.example.gtics_lab8_20201497.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class DatesDto {
    private LocalDate maximum;
    private LocalDate minimum;
}
