package com.politecnico.ingesoft2.ws;

import com.politecnico.ingesoft2.business.UserService;
import com.politecnico.ingesoft2.domain.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserAPI {

    private final UserService userService;

    @PutMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody UserDTO userInfo) {
        return null;
    }

}
