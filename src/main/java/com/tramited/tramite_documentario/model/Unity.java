package com.tramited.tramite_documentario.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "unity")
public class Unity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    private String name;

    public Unity(Integer id) {
        this.id = id;
    }
}
