/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tramited.tramite_documentario.repository;

import com.tramited.tramite_documentario.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Alfredo
 */
public interface UserRepository extends JpaRepository<User, Integer>{
    
}
