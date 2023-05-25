/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.service.impl;

import com.aldrin.foodfam.model.Country;
import com.aldrin.foodfam.model.User;
import com.aldrin.foodfam.repository.CountryRepository;
import com.aldrin.foodfam.service.CountryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * @author ALDRIN
 */
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;


    @Override
    public List<Country> getCountry() {
        return countryRepository.findAll();
    }


//    @Override
//    public List<Country> getCountry() {
//     return countryRepository.getCountryOnlyContaining();
//    }
   

    

}
