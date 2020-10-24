package com.isil.jazba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.isil.jazba.model.User;

public interface IUserJPA extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
