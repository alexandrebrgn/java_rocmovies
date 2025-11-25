package com.ndduroc.rocmovies.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="LASTNAME", length=50, nullable=false, unique=false)
    private String lastname;

    @Column(name="FIRSTNAME", length=50, nullable=false, unique=false)
    private String firstname;

    @Column(name="BIRTHDAY", length=50, nullable=false, unique=false)
    private Date birthday;

    public Integer getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


}