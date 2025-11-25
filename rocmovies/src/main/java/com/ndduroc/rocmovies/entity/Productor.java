package com.ndduroc.rocmovies.entity;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name="productor")
public class Productor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME", length = 50, nullable = false, unique = false)
    private Integer name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }
}