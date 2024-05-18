package com.politecnico.ingesoft2.domain;

import com.politecnico.ingesoft2.util.RoleEnum;
import lombok.Data;

@Data
public class UserDTO {

    private String id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String cellphone;
    private boolean isActive;
    private RoleEnum role;

}
