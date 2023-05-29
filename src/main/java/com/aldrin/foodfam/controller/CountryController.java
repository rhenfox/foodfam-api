/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.controller;

import com.aldrin.foodfam.model.Country;
import com.aldrin.foodfam.repository.CountryRepository;
import com.aldrin.foodfam.service.CountryService;
//import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ALDRIN
 */
@RestController
@RequestMapping("/country/")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @Autowired
    private CountryRepository countryRepository;

//    @GetMapping("/list")
//    public ResponseEntity<List<Country>> getCountrySortByKeyword(@RequestParam String name) {
//        return new ResponseEntity<List<Country>>(countryService.getCountrySortByKeyword(name), HttpStatus.OK);
//    }
//    //READ user list
    @GetMapping("/list")
    public ResponseEntity<List<Country>> getCountryList() {
        return new ResponseEntity<List<Country>>(countryService.getCountry(), HttpStatus.OK);
    }

    @GetMapping("/listObject")
    public List<Object> getCountry() {
        List<Object> country = countryRepository.getCodeAndCountry();
        return country;
    }


}
