/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodfam.service;

import com.aldrin.foodfam.model.User;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author ALDRIN
 */

public interface UserService {
    
    //list
    List<User> getUser();
    
    //add
    User saveUser(User user);
    
    //update
    User updateUser(User user);
    
    //delete
    void deleteUser(Long id);

    //view details
    User getUserInfo(Long id);
    
    List<User> searchUserFilterByName(String name);
    
    List<User> searchUser(int pageNumber, int pageSize);
    


//    List<Employee> getEmployeesByNameAndLocation(String name, String location);
//
//    List<Employee> getEmployeesByKeyword(String name);
//
//    List<Employee> getEmployee(int pageNumber, int pageSize);
//
//    List<Employee> getEmployeesSortByKeyword(String name);
//
//    List<Employee> getEmployeePagingAndSorting(int pageNumber, int pageSize);
//    
//    List<Employee> getEmployeeNameOrLocation(String name, String location);
//    
//    Integer deleteEmployeeByName(String name);
}
