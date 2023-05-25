/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author ALDRIN
 */
@Setter
@Getter
@ToString
@Entity
public class Country {

    @Id
    @Column(name="code",columnDefinition="CHAR(3)")
    private String code;

    @Column(name = "name", columnDefinition = "CHAR(52)")
    private String name;

//    @Column(name="Continent")
//    @Enumerated(value = EnumType.STRING)
////    @Enumerated(EnumType.STRING)
//    private Continent continent;
    @Column(name = "region", columnDefinition = "CHAR(26)")
    private String region;

    @Column(name = "surface_area", columnDefinition = "DECIMAL(10,2)")
    private Double surface_area;

//    @Column(name="indep_year",nullable = true,columnDefinition = "INT")
//    private Integer indep_year;
    @Column(name = "population", nullable = true, columnDefinition = "INT")
    private Integer population;

//    @Column(name="life_expectancy",nullable = true,columnDefinition="DECIMAL(3,1)")
//    private Double life_expectancy;
    @Column(name = "gnp", nullable = true, columnDefinition = "DECIMAL(10,2)")
    private Double gnp;

//    @Column(name="gnpold",nullable = true,columnDefinition="DECIMAL(10,2)")
//    private Double gnpold;
    @Column(name = "local_name", columnDefinition = "CHAR(50)")
    private String local_name;

    @Column(name = "government_form", nullable = true, columnDefinition = "CHAR(80)")
    private String government_form;

    @Column(name = "head_of_state", length = 80, nullable = true, columnDefinition = "CHAR(70)")
    private String head_of_state;

    @Column(name = "capital", nullable = true, columnDefinition = "INT")
    private String capital;

    @Column(name = "code2", columnDefinition = "CHAR(2)")
    private String code2;

}
