/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tramited.tramite_documentario.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Alfredo
 */
@Data
@Entity
@Table(name = "person")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "father_name")
    private String fatherName;
    @Column(name = "mother_name")
    private String motherName;
    @Column(name = "e_mail")
    private String eMail;
    
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    @ManyToOne
    private User idUser;
    
    @JoinColumn(name = "id_person_created", referencedColumnName = "id")
    @ManyToOne
    private Person idPersonCreated;
    
    public Person (Integer id){this.id =id;}
}
