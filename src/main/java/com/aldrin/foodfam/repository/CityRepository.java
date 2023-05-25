/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.repository;

import com.aldrin.foodfam.model.City;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author ALDRIN
 */
@Repository
public interface CityRepository extends JpaRepository<City, Long> {


//  http://localhost:8080/city/list/Philippines parameter is country
    @Query(" FROM City  c WHERE country_code.name = :name ORDER BY c.name ASC")
    List<City> getCityByCountryContaining(String name);
}
