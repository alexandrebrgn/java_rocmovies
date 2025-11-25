package com.ndduroc.rocmovies.service;

import com.ndduroc.rocmovies.entity.Movie;
import com.ndduroc.rocmovies.entity.MovieDTO;

import java.util.List;
import java.util.Optional;

public interface IMovieService {
    List<Movie> getListMovies();

    Optional<Movie> getMovieById(long id);

    List<Movie> addMovie(MovieDTO movieDTO);

    List<Movie> getMovieByStyle(Integer style);

    List<Movie> getMovieBetween(int start, int end);
}
