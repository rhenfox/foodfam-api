/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.service.impl;

import com.aldrin.foodfam.model.User;
import com.aldrin.foodfam.repository.UserRepository;
import com.aldrin.foodfam.service.UserService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * @author ALDRIN
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    //VIEW single user information
    @Override
    public User getUserInfo(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        }
        throw new RuntimeException("User is not found for the id" + id);
    }

    @Override
    public List<User> searchUserFilterByName(String name) {
//        return userRepository.findByNameContaining(name);
        if (name!= null) {
            return userRepository.findByNameContaining(name);
        }
        return userRepository.findAll();
    }

    @Override
    public List<User> searchUser(int pageNumber, int pageSize) {
        Pageable pages = PageRequest.of(pageNumber, pageSize, Sort.Direction.ASC, "id", "name");
        return userRepository.findAll(pages).getContent();
    }

}
