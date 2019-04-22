/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tramited.tramite_documentario.repository;

import com.tramited.tramite_documentario.model.Person;
import com.tramited.tramite_documentario.model.extra.PersonResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *
 * @author Alfredo
 */
public interface PersonRepository extends JpaRepository<Person, Integer>{

    @Query(value = "select new com.tramited.tramite_documentario.model.extra.PersonResponse(" +
            "s.id, s.name, s.fatherName, s.motherName, " +
            "s.idUser.username, s.idUser.password, s.idUser.idRole.name)" +
            " from Person s")
    List<PersonResponse> findAllPersons();

}
