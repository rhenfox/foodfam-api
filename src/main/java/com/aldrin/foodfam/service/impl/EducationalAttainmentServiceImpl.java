/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.service.impl;

import com.aldrin.foodfam.model.EducationalAttainment;
import com.aldrin.foodfam.repository.EducationalAttainmentRepository;
import com.aldrin.foodfam.service.EducationalAttainmentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ALDRIN
 */
@Service
public class EducationalAttainmentServiceImpl implements EducationalAttainmentService {

    @Autowired
    private EducationalAttainmentRepository educationalAttainmentRepository;

    @Override
    public EducationalAttainment saveEducationalAttainment(EducationalAttainment ea) {
        return educationalAttainmentRepository.save(ea);
    }

    @Override
    public List<EducationalAttainment> getEducationalAttainment() {
        return educationalAttainmentRepository.findAll();
    }

    @Override
    public void deleteEducationalAttainment(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EducationalAttainment updateEducationalAttainment(EducationalAttainment employee) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
