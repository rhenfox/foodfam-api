/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.controller;

import com.aldrin.foodfam.model.User;
import com.aldrin.foodfam.model.UserProfile;
import com.aldrin.foodfam.service.UserProfileService;
//import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ALDRIN
 */
@Controller
@RequestMapping("/userProfile/")
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    //ADD user profile to save
    @PostMapping("/add")
    public ResponseEntity<UserProfile> save( @RequestBody UserProfile up) {
        return new ResponseEntity<>(userProfileService.saveUserProfile(up), HttpStatus.CREATED);
    }

    //READ user profile list
    @GetMapping("/list")
    public ResponseEntity<List<UserProfile>> getUserProfileList() {
        return new ResponseEntity<List<UserProfile>>(userProfileService.getUserProfile(), HttpStatus.OK);
    }

    //UPDATE user profile
    @PutMapping("/update/{id}")
    public ResponseEntity<UserProfile> updateUserProfile(@PathVariable Long id, @RequestBody UserProfile up) {
        up.setId(id);
        return new ResponseEntity<UserProfile>(userProfileService.updateUserProfile(up), HttpStatus.OK);
    }

    //VIEW user profile info
    @GetMapping("/info/{id}")
    public ResponseEntity<UserProfile> getUserInfo(@PathVariable Long id) {
        return new ResponseEntity<>(userProfileService.getUserProfileInfo(id), HttpStatus.OK);
    }
}
