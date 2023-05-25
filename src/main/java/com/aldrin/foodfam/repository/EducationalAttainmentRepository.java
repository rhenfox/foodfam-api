/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.repository;

import com.aldrin.foodfam.model.EducationalAttainment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ALDRIN
 */
@Repository
public interface EducationalAttainmentRepository extends JpaRepository<EducationalAttainment, Long>{
    
}
