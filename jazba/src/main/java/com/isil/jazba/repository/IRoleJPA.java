package com.isil.jazba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.isil.jazba.model.Role;

public interface IRoleJPA extends JpaRepository<Role, Long> {
}
