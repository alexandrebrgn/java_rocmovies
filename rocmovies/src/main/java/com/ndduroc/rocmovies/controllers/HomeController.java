package com.ndduroc.rocmovies.controllers;

import com.ndduroc.rocmovies.repository.MovieRepository;
import com.ndduroc.rocmovies.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.sql.Statement;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private IMovieService movieService;
    private MovieRepository movieRepository;

    @RequestMapping("")
    public String displayHomePage(@RequestParam(required = false) Integer style, Model model) {
        model.addAttribute("movies", movieService.getListMovies());
        return "home.html";
    }

//    @RequestMapping("/movie")
//    public String displayMoviePage(@RequestParam long id, Model model) {
//        model.addAttribute("movie", movieService.getMovieById(id));
//        return "movie.html";
//    }
}
