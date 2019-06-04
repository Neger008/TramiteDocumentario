package com.tramited.tramite_documentario.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "staff")
public class Staff implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String state;
    @JoinColumn(name = "unity_id", referencedColumnName = "id")
    @ManyToOne
    private Unity idUnity;
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    @ManyToOne
    private Person idPerson;
}
