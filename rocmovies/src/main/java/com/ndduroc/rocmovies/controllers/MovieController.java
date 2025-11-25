package com.ndduroc.rocmovies.controllers;
import com.ndduroc.rocmovies.entity.Movie;
import com.ndduroc.rocmovies.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value={"/", "/movies"})
public class MovieController {

    @Autowired
    private IMovieService movieService;

    @GetMapping("")
    public List<Movie> GetAllMovies() {
        return movieService.getListMovies();
    }

    @GetMapping("/{id}")
    public String displayMoviePage(@PathVariable("id") long movieId, Model model) {
        Movie movie = movieService.getMovieById(movieId).get();
        System.out.println(movie);
        if (movie != null) {
            model.addAttribute("movie", movie);
            return "movie.html";
        } else {
            return "home.html";
        }
    }

    @PostMapping
    public List<Movie> createMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }
}
