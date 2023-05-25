/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.controller;

import com.aldrin.foodfam.model.City;
import com.aldrin.foodfam.model.User;
import com.aldrin.foodfam.repository.CityRepository;
import com.aldrin.foodfam.service.CityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ALDRIN
 */
@RestController
@RequestMapping("/city/")
public class CityController {

    @Autowired
    private CityService cityService;

    @Autowired
    private CityRepository cityRepository;

    //ADD user to save
    @PostMapping("/add")
    public ResponseEntity<City> save(@RequestBody City city) {
        return new ResponseEntity<>(cityService.saveCity(city), HttpStatus.CREATED);
    }

//    //UPDATE user
//    @PutMapping("/update/{id}")
//    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
//        user.setId(id);
//        return new ResponseEntity<User>(userService.updateUser(user), HttpStatus.OK);
//    }
//
//    //DELETE user --/delete?id=1
//    @DeleteMapping("/delete")
//    public void deleteUser(@RequestParam Long id) {
//        userService.deleteUser(id);
//    }
//
//    //VIEW user info
//    @GetMapping("/info/{id}")
//    public ResponseEntity<User> getUserInfo(@PathVariable Long id) {
//        return new ResponseEntity<>(userService.getUserInfo(id), HttpStatus.OK);
//    }
//
//    //READ user list
//    @GetMapping("/list")
//    public ResponseEntity<List<User>> getUserList() {
//        return new ResponseEntity<List<User>>(userService.getUser(), HttpStatus.OK);
//    }
//    @GetMapping("/searchByCode")
//    public ResponseEntity<List<City>> getCityByCode(@RequestParam String country_code) {
//        return new ResponseEntity<List<City>>(cityService.getCityByCountryCode(country_code), HttpStatus.OK);
//    }
    @GetMapping("/list/{name}")
    public ResponseEntity<List<City>> getCityByCountry(@PathVariable String name) {
//        Sort sort = Sort.by(Sort.Direction.ASC, "id","name");
        return new ResponseEntity<List<City>>(cityRepository.getCityByCountryContaining(name), HttpStatus.OK);
    }
}
