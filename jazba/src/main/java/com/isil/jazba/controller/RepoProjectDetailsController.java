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

import com.isil.jazba.dto.RepoProjectDetailsDTO;
import com.isil.jazba.service.RepoProjectDetailsService;


@RestController
@CrossOrigin
//@RequestMapping("jazba/api/v1/detallesRepositorio")
public class RepoProjectDetailsController {
    /*
	@Autowired
	private RepoProjectDetailsService repoProjectDetailsService;

    @GetMapping("")
    public ResponseEntity<List<RepoProjectDetailsDTO>> listAll() {
        return ResponseEntity.ok(repoProjectDetailsService.listAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RepoProjectDetailsDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(repoProjectDetailsService.getById(id));
    }

    @PostMapping(value = "")
    public ResponseEntity<Long> saveRepositorio(@RequestBody RepoProjectDetailsDTO repositorio) {
    	RepoProjectDetailsDTO savedRepositorio = repoProjectDetailsService.save(repositorio);
        return new ResponseEntity<>(savedRepositorio.getIdDetalles(), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Long> updateRepositorio(@PathVariable Long id, @RequestBody RepoProjectDetailsDTO repositorio) {
    	repositorio.setIdDetalles(id);
    	RepoProjectDetailsDTO updatedRepositorio = repoProjectDetailsService.update(repositorio);
        return ResponseEntity.ok(updatedRepositorio.getIdDetalles());
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteRepositorio(@PathVariable Long id) {
    	repoProjectDetailsService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
	

    */
}
