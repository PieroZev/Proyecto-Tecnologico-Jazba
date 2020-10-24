package com.isil.jazba.service;

import com.isil.jazba.repository.IRoleJPA;
import com.isil.jazba.repository.IUserJPA;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.isil.jazba.model.User;

import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {

    private final IUserJPA userRepository;
    private final IRoleJPA roleRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserServiceImpl(IUserJPA userRepository, BCryptPasswordEncoder bCryptPasswordEncoder, IRoleJPA roleRepository) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.roleRepository = roleRepository;
    }

    @Override
    public void save(User user) {
        String passwordEncode = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(passwordEncode);
        user.setRoles(new HashSet<>(roleRepository.findAll())); //TODO pending to review
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }
}
