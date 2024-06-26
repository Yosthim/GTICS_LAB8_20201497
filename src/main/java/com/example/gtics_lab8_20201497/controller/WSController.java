package com.example.gtics_lab8_20201497.controller;

import com.example.gtics_lab8_20201497.dao.MovieDao;
import com.example.gtics_lab8_20201497.entity.MovieListDto;
import com.example.gtics_lab8_20201497.repository.MovieRepository;
import com.example.gtics_lab8_20201497.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("movieXd")
public class WSController {
    private final UserRepository userRepository;
    private final MovieRepository movieRepository;
    private final MovieDao movieDao;

    public WSController(UserRepository userRepository, MovieRepository movieRepository, MovieDao movieDao) {
        this.userRepository = userRepository;
        this.movieRepository = movieRepository;
        this.movieDao = movieDao;
    }

    //LISTAR PELICULAS
    @GetMapping(value = "/list")
    public List<MovieListDto> listaProductos() {
        return movieDao.getAllMovies();
    }
}
