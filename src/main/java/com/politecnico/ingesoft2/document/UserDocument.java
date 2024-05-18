package com.politecnico.ingesoft2.document;

import com.politecnico.ingesoft2.util.RoleEnum;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class UserDocument {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String cellphone;
    private boolean isActive;
    private RoleEnum role;
}
