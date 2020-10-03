package com.isil.jazba.service;

import java.util.List;

import com.isil.jazba.dto.UsuarioDTO;

public interface UsuarioService {

	List<UsuarioDTO> listAll();

	UsuarioDTO getById(Long id);

	UsuarioDTO save(UsuarioDTO usuario);

	UsuarioDTO update(UsuarioDTO usuario);

	void delete(Long id);
}
