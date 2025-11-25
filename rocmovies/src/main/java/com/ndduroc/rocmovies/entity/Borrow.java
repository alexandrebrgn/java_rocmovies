package com.ndduroc.rocmovies.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "borrow")
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date", nullable = false, unique = false)
    @Temporal(TemporalType.DATE)
    private Date date;

//    @Column(name="customer_id", length=50, nullable=false, unique=false)
//    private Integer customer;

    @Column(name="movie_id", length=50, nullable=false, unique=false)
    private Integer movieId;

    @Column(name="status", length=50, nullable=false, unique=false)
    private String status;

    @ManyToOne
    @JoinColumn(name="customer_id", nullable = false)  // This is the foreign key column in BORROW
    private Customer customer;


    public Borrow(Date date, Customer customer, Integer movieId, String status) {
        this.date = date;
        this.customer = customer;
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

    public Customer getCustomerId() {
        return customer;
    }

    public void setCustomerId(Customer customer) {
        this.customer = customer;
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