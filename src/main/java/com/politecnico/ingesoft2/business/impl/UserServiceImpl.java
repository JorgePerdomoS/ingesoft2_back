package com.politecnico.ingesoft2.business.impl;

import com.politecnico.ingesoft2.business.UserService;
import com.politecnico.ingesoft2.document.UserDocument;
import com.politecnico.ingesoft2.domain.UserDTO;
import com.politecnico.ingesoft2.persistent.UserRepository;
import lombok.AllArgsConstructor;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final DozerBeanMapper mapper;

    @Override
    public String createUser(UserDTO user) {

        UserDocument userDocument = userRepository.
                findByUsernameAndEmail(user.getUsername(), user.getEmail()).orElse(null);

        if (userDocument == null) {
            userDocument = this.mapper.map(user, UserDocument.class);
            userRepository.save(userDocument);
            return String.format("Usuario con id %s creado correctamente", userDocument.getId());
        }
        return null;
    }
}
