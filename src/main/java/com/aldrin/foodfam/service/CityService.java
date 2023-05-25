/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.service;

import com.aldrin.foodfam.model.City;
import java.util.List;

/**
 * @author ALDRIN
 */
public interface CityService {
    
//    //list sorting
    List<City> getCity();
    
    //add
    City saveCity(City user);
    
    //update
    City updateCity(City user);
    
    //delete
    void deleteCity(Long id);

    //view details
    City getCityInfo(Long id);
    
//    List<City> getCityByCountryCode(String country_code);
}
