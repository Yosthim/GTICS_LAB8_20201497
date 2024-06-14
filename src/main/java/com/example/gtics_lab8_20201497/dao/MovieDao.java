package com.example.gtics_lab8_20201497.dao;

import com.example.gtics_lab8_20201497.entity.MovieListDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class MovieDao {
    public List<MovieListDto> getAllMovies() {
        List<MovieListDto> lista = new ArrayList<>();

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJlODhlMTQ2YzcwZDgyMWZjYzYzNzA5NzViNWZlMzRiYyIsInN1YiI6IjY2NjkwMjc4MTcwMGEwMGFhNTFkZGFkOCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.1UdT-TDzIUQD4E7n0ED8O9C4YDI68Flm1QNCmq5_-JM";
        headers.set("Authorization", "Bearer " + token);

        String endPoint = "https://api.themoviedb.org/3/movie/now_playing?language=en-US";

        //Entidad HTTP con encabezados
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<MovieListDto[]> responseEntity = restTemplate.exchange(endPoint, HttpMethod.GET, entity, MovieListDto[].class);

        if(responseEntity.getStatusCode().is2xxSuccessful()){
            MovieListDto[] body = responseEntity.getBody();
            lista = Arrays.asList(body);
        }

        return lista;
    }

    public MovieListDto getMovieById(int id) {}
}
