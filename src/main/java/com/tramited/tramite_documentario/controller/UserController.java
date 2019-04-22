/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tramited.tramite_documentario.controller;

import com.tramited.tramite_documentario.model.User;
import com.tramited.tramite_documentario.repository.UserRepository;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alfredo
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;
    
    @GetMapping
    public List<User> getUser(){
        return userRepository.findAll();
    }
    
    @PostMapping
    public String postUser(@RequestBody User user){
        userRepository.save(user);
        return "was added successfully";
    }
}
