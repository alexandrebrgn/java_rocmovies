package com.ndduroc.rocmovies.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "BORROW")
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "DATE", length = 50, nullable = false, unique = false)
    private Date date;

    @Column(name="CUSTOMER_ID", length=50, nullable=false, unique=false)
    private Integer customerId;

    @Column(name="MOVIE_ID", length=50, nullable=false, unique=false)
    private Integer movieId;

    @Column(name="STATUS", length=50, nullable=false, unique=false)
    private String status;


    public Borrow(Date date, Integer customerId, Integer movieId, String status) {
        this.date = date;
        this.customerId = customerId;
        this.movieId = movieId;
        this.status = status;
    }

    public Borrow() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}