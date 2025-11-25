package com.ndduroc.rocmovies.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.ndduroc.rocmovies.entity.Movie;
import com.ndduroc.rocmovies.entity.MovieDTO;
import com.ndduroc.rocmovies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Primary
@Service
public class MovieService1 implements IMovieService {

    @Autowired
    private MovieRepository movieRepo;


    @Override
    public List<Movie> getListMovies() {
        System.out.println("MovieService1 - getListMovie()");
        return movieRepo.findAll();
    }

    @Override
    public Optional<Movie> getMovieById(long id) {
        return movieRepo.findById((int) id);
    }

    @Override
    public List<Movie> getMovieByStyle(Integer style) {
        return movieRepo.findAll()
                .stream()
                .filter(m -> m.getStyle() == style)
                .collect(Collectors.toList());
    }

    @Override
    public List<Movie> addMovie(MovieDTO movieDTO) {
        return List.of();
    }

    @Override
    public List<Movie> getMovieBetween(int start, int end) {
        return movieRepo.findAll()
                .stream()
                .filter(m -> m.getProductionYear() >= start && m.getProductionYear() <= end)
                .collect(Collectors.toList());
    }
}

