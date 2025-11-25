package com.ndduroc.rocmovies.repository;
import com.ndduroc.rocmovies.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
