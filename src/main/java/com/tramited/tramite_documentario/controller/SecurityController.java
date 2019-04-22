package com.tramited.tramite_documentario.controller;

import com.tramited.tramite_documentario.model.Person;
import com.tramited.tramite_documentario.model.Role;
import com.tramited.tramite_documentario.model.User;
import com.tramited.tramite_documentario.model.extra.PersonResponse;
import com.tramited.tramite_documentario.model.extra.SecurityPersonRequest;
import com.tramited.tramite_documentario.repository.PersonRepository;
import com.tramited.tramite_documentario.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/security")
@RequiredArgsConstructor
public class SecurityController {

    private final PersonRepository personRepository;
    private final UserRepository userRepository;

    @PostMapping("/person/save")
    public String postSavePerson(@RequestBody SecurityPersonRequest person) {
        System.out.println(person);

        User user = new User();
        user.setUsername(person.getUsername());
        user.setPassword(person.getPassword());
        user.setIdRole(new Role(person.getIdRole()));
        System.out.println(user.getId());
        userRepository.save(user);
        System.out.println(user.getId());

        Person person1 = new Person();
        person1.setName(person.getName());
        person1.setFatherName(person.getFatherName());
        person1.setMotherName(person.getMotherName());
        person1.setEMail(person.getEmail());
        person1.setIdUser(user);

        personRepository.save(person1);

        return "aea";
    }
    @GetMapping("/person/view")
    public List<PersonResponse> getPersonResponse(){

        return personRepository.findAllPersons();
    }


}
