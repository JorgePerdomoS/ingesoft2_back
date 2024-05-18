package com.politecnico.ingesoft2.business.impl;

import com.github.dozermapper.core.Mapper;
import com.politecnico.ingesoft2.business.UserService;
import com.politecnico.ingesoft2.document.UserDocument;
import com.politecnico.ingesoft2.domain.UserDTO;
import com.politecnico.ingesoft2.persistent.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final Mapper mapper;

    @Override
    public String createUser(UserDTO user) {

        UserDocument userDocument = userRepository.
                findByUsernameAndEmail(user.getUsername(), user.getEmail()).orElse(null);

        if (userDocument != null) {
            return String.format("User with username %s and email %s already exists", user.getUsername(), user.getEmail());
        }

        userDocument = mapper.map(user, UserDocument.class);

        return String.format("Usuario con id %s creado correctamente", userDocument.getId());
    }
}
