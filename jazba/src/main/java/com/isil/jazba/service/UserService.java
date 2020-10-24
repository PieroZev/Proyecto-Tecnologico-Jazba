package com.isil.jazba.service;

import com.isil.jazba.model.User;

public interface UserService {

    void save(User user);

    public User findByUsername(String username);

}
