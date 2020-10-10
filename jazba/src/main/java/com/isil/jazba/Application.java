package com.isil.jazba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.isil.jazba.repository.RoleRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    RoleRepository roleRepository;

    public static void main(String[] args) {
        SpringApplication.run(com.isil.jazba.Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        roleRepository.save(new Role(null, "USER", null));

    }
}
