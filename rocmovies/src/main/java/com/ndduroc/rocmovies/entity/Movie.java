package com.ndduroc.rocmovies.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "TITLE", length = 50, nullable = false, unique = false)
    private String title;

    @Column(name = "STYLE", length = 50, nullable = false, unique = false)
    private Integer style;

    @Column(name = "PRODUCTION_YEAR", length = 50, nullable = false, unique = false)
    private Integer productionYear;

    @Column(name = "IMAGE", length = 300, nullable = false, unique = false)
    private String image;

    public Movie(String title, Integer style, int productionYear, String image) {
        this.title = title;
        this.style = style;
        this.productionYear = productionYear;
        this.image = image;
    }

    public Movie() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getIdMovie() {
        return id;
    }

    public void setIdMovie(int id) {
        this.id = id;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
