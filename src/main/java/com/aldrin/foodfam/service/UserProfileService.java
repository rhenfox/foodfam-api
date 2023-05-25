/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.service;

import com.aldrin.foodfam.model.User;
import com.aldrin.foodfam.model.UserProfile;
import java.util.List;

/**
 * @author ALDRIN
 */
public interface UserProfileService {

    List<UserProfile> getUserProfile();

    UserProfile saveUserProfile(UserProfile userProfile);

    UserProfile updateUserProfile(UserProfile userProfile);

    //view details
    UserProfile getUserProfileInfo(Long id);
}
