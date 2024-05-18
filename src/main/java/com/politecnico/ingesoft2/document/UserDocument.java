package com.politecnico.ingesoft2.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserDocument {

    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
}
