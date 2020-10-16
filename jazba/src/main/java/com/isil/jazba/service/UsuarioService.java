package com.isil.jazba.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.isil.jazba.dto.UsuarioDTO;

public interface UsuarioService {

	List<UsuarioDTO> listAll();

	UsuarioDTO getById(Long id);
	
	List<UsuarioDTO> getByCorreo(String correo);

	UsuarioDTO save(UsuarioDTO usuario);

	UsuarioDTO update(UsuarioDTO usuario);

	void delete(Long id);
}
