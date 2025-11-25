package com.ndduroc.rocmovies.entity;

import jakarta.persistence.*;

@Entity
@Table(name="style")
public class Style {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="NAME", length=50, nullable=false, unique=false)
    private String name;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }
}
