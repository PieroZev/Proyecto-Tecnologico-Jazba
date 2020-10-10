package com.isil.jazba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.isil.jazba.model.User;
import com.isil.jazba.repository.RoleRepository;
import com.isil.jazba.repository.UserRepository;

import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
    private UserRepository userRepository;
	@Autowired
    private RoleRepository roleRepository;
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        String passwordEncode = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(passwordEncode);
        user.setRoles(new HashSet<>(roleRepository.findAll())); //TODO pending to review
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
