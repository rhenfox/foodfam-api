/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.model;

import com.aldrin.foodfam.model.enumeration.MaritalStatus;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * @author ALDRIN
 */
@Setter
@Getter
@ToString
@Entity
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;
    private String location;
    private String gender;
    private Date birthday;
    private Integer zipcode;
    @JoinColumn(name = "country_id")
    @ManyToOne
    private Country country;
    //Optional
    private String  state;
    @JoinColumn(name = "city_id")
    @ManyToOne
    private City city;
    //Optional ethnicity or language
    @JoinColumn(name = "country_language_id")
    @ManyToOne
    private CountryLanguage ethnicity;
    private Double height;
    private Double weight;
    private String bodyType;
    private String lifeStyle;
    @Column(name="Continent")
    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;
    @JoinColumn(name = "educational_Attainment_id")
    @ManyToOne
    private EducationalAttainment educationalAttainment;
    private String livingCondition;
    private String profession;
    @Lob
    @Column(length = 16777214)
    private byte[] photo;
    @CreationTimestamp
    @Column(name="create_at", nullable=false,updatable=false)
    private Date createAt;
    @UpdateTimestamp
    @Column(name="update_at")
    private Date updateAt;
}