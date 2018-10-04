package com.example.brands.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Brands {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String brandName;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    private Long voteNumber;

    protected Brands() {}

    public Brands(String brandName, String gender, String genre, Long voteNumber) {
        this.brandName = brandName;
        this.gender = gender;
        this.genre = genre;
        this.voteNumber = voteNumber;
     }

     


}

