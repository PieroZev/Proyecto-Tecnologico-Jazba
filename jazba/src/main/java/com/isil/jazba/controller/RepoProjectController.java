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

import com.isil.jazba.dto.RepoProjectDTO;
import com.isil.jazba.service.RepoProjectService;

@RestController
@CrossOrigin
@RequestMapping("jazba/api/v1/repositorio")
public class RepoProjectController {

	@Autowired
	private RepoProjectService repoProjectService;

    @GetMapping("")
    public ResponseEntity<List<RepoProjectDTO>> listAll() {
        return ResponseEntity.ok(repoProjectService.listAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RepoProjectDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(repoProjectService.getById(id));
    }

    @PostMapping(value = "")
    public ResponseEntity<Long> saveRepositorio(@RequestBody RepoProjectDTO repositorio) {
    	RepoProjectDTO savedRepositorio = repoProjectService.save(repositorio);
        return new ResponseEntity<>(savedRepositorio.getIdRepositorio(), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Long> updateRepositorio(@PathVariable Long id, @RequestBody RepoProjectDTO repositorio) {
    	repositorio.setIdRepositorio(id);
    	RepoProjectDTO updatedRepositorio = repoProjectService.update(repositorio);
        return ResponseEntity.ok(updatedRepositorio.getIdRepositorio());
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteRepositorio(@PathVariable Long id) {
    	repoProjectService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
