/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.model.enumeration;

import lombok.ToString;

/**
 * @author ALDRIN
 */
@ToString
public enum Continent {
    ASIA("Asia"),
    EUROPE("Europe"),
    NORTH_AMERICA("North America"),
    AFRICA("Africa"),
    OCIANIA("Ociania"),
    ANTARTICA("Antartica"),
    SOUTH_AMERICA("South America");

    private String continent;

    Continent(String continent) {
        this.continent = continent;
    }

    public String displayContinent() {
        return continent;
    }

    // Optionally and/or additionally, toString.
    @Override
    public String toString() {
        return continent;
    }
    
    

}
