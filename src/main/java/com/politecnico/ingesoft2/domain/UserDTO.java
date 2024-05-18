package com.politecnico.ingesoft2.domain;

import lombok.Data;

@Data
public class UserDTO {

    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;

}
