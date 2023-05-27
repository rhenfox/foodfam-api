/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aldrin.foodfam.repository;

import com.aldrin.foodfam.model.Country;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ALDRIN
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    @Query("SELECT c.name FROM Country c")
    List<Country> getCountryOnlyContaining();
    
    @Query("SELECT c.code, c.name FROM Country c")
    List<Object> getCodeAndCountry();
    

    
}
