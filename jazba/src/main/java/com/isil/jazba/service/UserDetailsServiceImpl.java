package com.isil.jazba.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.isil.jazba.model.Role;
import com.isil.jazba.model.User;
import com.isil.jazba.repository.IUserJPA;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final IUserJPA userRepository;

    public UserDetailsServiceImpl(IUserJPA userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User currentUser = userRepository.findByUsername(username);
        if(currentUser == null){
            throw new UsernameNotFoundException(username);
        }

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for (Role role : currentUser.getRoles()){
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        }

        return new org.springframework.security.core.userdetails.
                User(currentUser.getUsername(), currentUser.getPassword(), grantedAuthorities);
    }
}
