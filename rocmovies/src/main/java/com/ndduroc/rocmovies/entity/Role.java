package com.ndduroc.rocmovies.entity;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name="ROLE")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="ACTOR_ID", length=50, nullable=false, unique=false)
    private Integer actorId;

    @Column(name="MOVIE_ID", length=50, nullable=false, unique=false)
    private Integer movieId;

    @Column(name="ROLE", length=50, nullable=false, unique=false)
    private String role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }
}