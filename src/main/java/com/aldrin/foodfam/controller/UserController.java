/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.controller;

import com.aldrin.foodfam.model.User;
import com.aldrin.foodfam.repository.UserRepository;
import com.aldrin.foodfam.service.UserService;
//import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ALDRIN
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    //ADD user to save
    @PostMapping("/add")
    public ResponseEntity<User> save( @RequestBody User user) {
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    //UPDATE user
    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return new ResponseEntity<User>(userService.updateUser(user), HttpStatus.OK);
    }

    //DELETE user --/delete?id=1
    @DeleteMapping("/delete")
    public void deleteUser(@RequestParam Long id) {
        userService.deleteUser(id);
    }

    //VIEW user info
    @GetMapping("/info/{id}")
    public ResponseEntity<User> getUserInfo(@PathVariable Long id) {
        return new ResponseEntity<>(userService.getUserInfo(id), HttpStatus.OK);
    }

    //READ user list
    @GetMapping("/list")
    public ResponseEntity<List<User>> getUserList() {
        return new ResponseEntity<List<User>>(userService.getUser(), HttpStatus.OK);
    }

    //SEARCH by name %like%
    @GetMapping("/filterByName")
    public ResponseEntity<List<User>> searchUserFilterByName(@RequestParam String name) {
        return new ResponseEntity<List<User>>(userService.searchUserFilterByName(name), HttpStatus.OK);
    }

    //SEARCH include pagination and sorting
    //http://localhost:8080/user/search?name=jop&page=0&size=1
    @GetMapping("/search")
    public ResponseEntity<Map<String, Object>> getAllTutorials(
            @RequestParam(required = false) String name,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size
    ) {

        try {
            List<User> userList = new ArrayList<User>();
            Pageable paging = PageRequest.of(page, size, Sort.Direction.ASC, "name", "name");
//            Pageable paging = PageRequest.of(page, size, Sort.Direction.ASC, "name", "name");
            Page<User> user;
            if (name == null) {
                user = userRepository.findAll(paging);
            } else {
                user = userRepository.findByNameContaining(name, paging);
            }
            userList = user.getContent();
            Map<String, Object> response = new HashMap<>();
            response.put("users", userList);
            response.put("currentPage", user.getNumber());
            response.put("totalUser", user.getTotalElements());
            response.put("totalPages", user.getTotalPages());

            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
