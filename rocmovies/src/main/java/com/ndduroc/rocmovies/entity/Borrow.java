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

    @Column(name="ACTOR_ID", length=50, nullable=false, unique=false)
    private Integer actorId;

    @Column(name="STATUS", length=50, nullable=false, unique=false)
    private String status;

}