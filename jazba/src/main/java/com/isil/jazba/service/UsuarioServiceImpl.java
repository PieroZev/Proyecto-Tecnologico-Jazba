package com.isil.jazba.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isil.jazba.dto.UsuarioDTO;
import com.isil.jazba.mapper.UsuarioMapper;
import com.isil.jazba.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
    private UsuarioMapper usuarioMapper;
	
	public List<UsuarioDTO> listAll() {
		return usuarioRepository.findAll().stream()
                .map(usuarioMapper::toDTO)
                .collect(Collectors.toList());
	}

	public UsuarioDTO getById(Long id) {
	        return usuarioRepository.findById(id).map(usuarioMapper::toDTO)
	                .orElseThrow(() -> new NoSuchElementException(id+""));
	}
	
	public List<UsuarioDTO> getByCorreo(String correo) {
        return usuarioRepository.findByCorreo(correo).stream()
        		.map(usuarioMapper::toDTO)
        		.collect(Collectors.toList());
}

	public UsuarioDTO save(UsuarioDTO usuario) {
		 boolean exists = usuario.getDni() != null && usuarioRepository.existsById(usuario.getDni());
	        if (exists) {
	            throw new IllegalArgumentException(usuario.getDni() + "");
	        }
	        return this.usuarioMapper.toDTO(usuarioRepository.save(this.usuarioMapper.fromDTO(usuario)));
	}

	public UsuarioDTO update(UsuarioDTO usuario) {
		boolean exists = usuarioRepository.existsById(usuario.getDni());
        if (!exists) {
            throw new NoSuchElementException(usuario.getDni() + "");
        }
        return this.usuarioMapper.toDTO(usuarioRepository.save(this.usuarioMapper.fromDTO(usuario)));
	}

	public void delete(Long id) {
		
		boolean exists = usuarioRepository.existsById(id);
        if (!exists) {
            throw new NoSuchElementException(id + "");
        }
        usuarioRepository.deleteById(id);
	}

}
