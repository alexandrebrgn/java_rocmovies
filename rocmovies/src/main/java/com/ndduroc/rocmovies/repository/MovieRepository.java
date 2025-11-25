package com.ndduroc.rocmovies.repository;
import com.ndduroc.rocmovies.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
