package com.ndduroc.rocmovies;

import com.ndduroc.rocmovies.entity.Movie;
import com.ndduroc.rocmovies.repository.MovieRepository;
import com.ndduroc.rocmovies.service.IMovieService;
import com.ndduroc.rocmovies.service.MovieService1;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class MovieServiceTests {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private MovieRepository movieRepository;

    @InjectMocks
    private MovieService1 movieService;

    @Test
    void testFindMovieById_MovieExists() {
        Movie mockMovie = new Movie("The Shawshank Redemption", 1,1994,"https://image.tmdb.org/t/p/w500/q6y0Go1tsGEsmtFryDOJo3dEmqu.jpg");
        Movie movie = movieService.getMovieById(11).orElse(new Movie("OuI", 1, 2000, "r"));

        assertNotNull(movie);
        assertEquals(mockMovie.getTitle(), movie.getTitle());
        assertEquals(mockMovie.getStyle(), movie.getStyle());
        assertEquals(mockMovie.getProductionYear(), movie.getProductionYear());
        assertEquals(mockMovie.getImage(), movie.getImage());
    }

    @Test
    void testGetMovieById() throws Exception {
        mockMvc.perform(get("http://localhost:9090/rocmovies/movie/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.title").exists());
    }
}
