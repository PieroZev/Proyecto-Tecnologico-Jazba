package com.isil.jazba.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.isil.jazba.model.User;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, String> {
    User findByEmailIgnoreCase(String email);

}
