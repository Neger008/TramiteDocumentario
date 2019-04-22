/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tramited.tramite_documentario.controller;

import com.tramited.tramite_documentario.model.Role;
import com.tramited.tramite_documentario.model.User;
import com.tramited.tramite_documentario.repository.RoleRepository;
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
@RequestMapping("/role")
@RequiredArgsConstructor
public class RoleController {

    private final RoleRepository roleRepository;
    
    @GetMapping
    public List<Role> getRole(){
        return roleRepository.findAll();
    }
    
    @PostMapping
    public String postRole(@RequestBody Role role){
        roleRepository.save(role);
        return "was added successfully";
    }
}
