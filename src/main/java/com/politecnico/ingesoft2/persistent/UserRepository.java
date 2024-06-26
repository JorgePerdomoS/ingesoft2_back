package com.politecnico.ingesoft2.persistent;

import com.politecnico.ingesoft2.document.UserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<UserDocument, String> {
    Optional<UserDocument> findByUsernameAndEmail(String username, String email);
}
