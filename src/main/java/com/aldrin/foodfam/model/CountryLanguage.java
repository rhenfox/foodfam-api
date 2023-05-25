/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.model;

import com.aldrin.foodfam.model.enumeration.IsOfficial;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class CountryLanguage implements Serializable {
    @Id
    @JoinColumn(name="country_code")
    @ManyToOne
    private Country country_code;
    
    @Column(name = "Language",length = 30)
    private String language;
    
    @Column(name = "is_official")
    @Enumerated(EnumType.STRING)
    private IsOfficial is_official;
    
    @Column(name = "Percentage")
    private Double percentage;
    
    
}
