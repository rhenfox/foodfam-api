/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.controller;

import com.aldrin.foodfam.model.EducationalAttainment;
import com.aldrin.foodfam.service.EducationalAttainmentService;
//import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ALDRIN
 */
@Controller
@RequestMapping("/educationalAttainment/")
public class EducationalAttainmentController {

    @Autowired
    private EducationalAttainmentService educationalAttainmentService;

    @PostMapping("/add")
    public ResponseEntity<EducationalAttainment> saveEmployee(@RequestBody EducationalAttainment ea) {
        return new ResponseEntity<>(educationalAttainmentService.saveEducationalAttainment(ea), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<EducationalAttainment>> getEducationalAttainmentList() {
        return new ResponseEntity<List<EducationalAttainment>>(educationalAttainmentService.getEducationalAttainment(), HttpStatus.OK);
    }
}
