package com.isil.jazba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isil.jazba.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	List<Usuario> findAllByOrderByNombreAsc();
}
