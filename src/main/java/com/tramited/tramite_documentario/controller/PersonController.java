/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tramited.tramite_documentario.controller;

import com.tramited.tramite_documentario.model.Person;
import com.tramited.tramite_documentario.repository.PersonRepository;
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
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository personRepository;
    
    @GetMapping("/view_persons")
    public List<Person> getPerson(){
        return personRepository.findAll();
    }
    @PostMapping("/add_person")
    public String postPerson(@RequestBody Person person){
        personRepository.save(person);
        return "was added successfully";
    }
}    

