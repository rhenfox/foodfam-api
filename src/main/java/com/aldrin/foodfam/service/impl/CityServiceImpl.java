/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.service.impl;

import com.aldrin.foodfam.model.City;
import com.aldrin.foodfam.model.User;
import com.aldrin.foodfam.repository.CityRepository;
import com.aldrin.foodfam.service.CityService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ALDRIN
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> getCity() {
        return cityRepository.findAll();
    }

    @Override
    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public City updateCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }

    @Override
    public City getCityInfo(Long id) {
        Optional<City> city = cityRepository.findById(id);
        if (city.isPresent()) {
            return city.get();
        }
        throw new RuntimeException("City is not found for the id" + id);
    }

//    @Override
//    public List<City> getCityByCountryCode(String country_code) {
//        return cityRepository.findCityByCode(country_code);
//    }

   

}
