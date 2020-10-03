package com.isil.jazba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isil.jazba.dto.UsuarioDTO;
import com.isil.jazba.service.UsuarioService;

@RestController
@CrossOrigin
@RequestMapping("jazba/api/v1/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

    @GetMapping("")
    public ResponseEntity<List<UsuarioDTO>> listAll() {
        return ResponseEntity.ok(usuarioService.listAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioService.getById(id));
    }

    @PostMapping(value = "")
    public ResponseEntity<Long> saveJugador(@RequestBody UsuarioDTO usuario) {
    	UsuarioDTO savedUsuario = usuarioService.save(usuario);
        return new ResponseEntity<>(savedUsuario.getDni(), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Long> updateJugador(@PathVariable Long id, @RequestBody UsuarioDTO usuario) {
    	usuario.setDni(id);
        UsuarioDTO updatedUsuario = usuarioService.update(usuario);
        return ResponseEntity.ok(updatedUsuario.getDni());
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteJugador(@PathVariable Long id) {
    	usuarioService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
