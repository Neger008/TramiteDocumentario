package com.tramited.tramite_documentario.model.extra;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonResponse {
    //s.id, s.name, s.fatherName, s.motherName, s.idUser.username, s.idUser.password, s.idUser.idRole.name
    private Integer id;
    private String name;
    private String fatherName;
    private String motherName;
    private String username;
    private String password;
    private String nameRole;

}
