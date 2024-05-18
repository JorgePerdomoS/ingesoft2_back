package com.politecnico.ingesoft2.business;

import com.politecnico.ingesoft2.domain.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    String createUser(UserDTO user);

}
