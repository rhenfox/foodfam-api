/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.service;

import com.aldrin.foodfam.model.EducationalAttainment;
import java.util.List;

/**
 *
 * @author ALDRIN
 */
public interface EducationalAttainmentService {

    List<EducationalAttainment> getEducationalAttainment();

    EducationalAttainment saveEducationalAttainment(EducationalAttainment employee);

//    EducationalAttainment getSingleEducationalAttainment(Long id);
    void deleteEducationalAttainment(Long id);

    EducationalAttainment updateEducationalAttainment(EducationalAttainment employee);
}
