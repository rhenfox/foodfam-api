/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.repository;

import com.aldrin.foodfam.model.User;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ALDRIN
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
//  select * from user where name LIKE "%Aldrin%"
//  use containing method  
    List<User> findByNameContaining(String keyword);
    
    Page<User> findAll(Pageable pageable);
    
    Page<User> findByNameContaining(String name, Pageable pageable);
}
