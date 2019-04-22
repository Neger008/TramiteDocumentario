package com.tramited.tramite_documentario.model.extra;

import lombok.Data;

@Data
public class SecurityPersonRequest {
    private String name;
    private String fatherName;
    private String motherName;
    private String email;

    private String username;
    private String password;

    private Integer idRole;
}
