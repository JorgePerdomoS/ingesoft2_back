package com.politecnico.ingesoft2.ws;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAPI {

    @PutMapping("/create")
    public ResponseEntity<String> create() {
        return null;
    }

}
