package com.isil.jazba.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isil.jazba.dto.RepoProjectDTO;
import com.isil.jazba.dto.RepoProjectDetailsDTO;
import com.isil.jazba.mapper.RepoProjectDetailsMapper;
import com.isil.jazba.mapper.RepoProjectMapper;
import com.isil.jazba.model.RepoProjectDetails;
import com.isil.jazba.repository.RepoProjectDetailsRepository;
import com.isil.jazba.repository.RepoProjectRepository;

@Service
public class RepoProjectServiceImpl implements RepoProjectService{

	@Autowired
	private RepoProjectRepository repoProjectRepository;
	@Autowired
    private RepoProjectMapper repoProjectMapper;
	
	@Autowired
	private RepoProjectDetailsRepository repoProjectDetailsRepository;
	@Autowired
    private RepoProjectDetailsMapper reporProjectDetailsMapper;
	
	public List<RepoProjectDTO> listAll() {
		
		List<RepoProjectDTO> listaProyectos = new ArrayList<RepoProjectDTO>();
		
		listaProyectos = repoProjectRepository.findAll().stream()
                .map(repoProjectMapper::toDTO)
                .collect(Collectors.toList());
		
		return listaProyectos;
	}

	public RepoProjectDTO getById(Long id) {
	        return repoProjectRepository.findById(id).map(repoProjectMapper::toDTO)
	                .orElseThrow(() -> new NoSuchElementException(id+""));
	}

	public RepoProjectDTO save(RepoProjectDTO repoProject) {
		 boolean exists = repoProject.getIdRepositorio() != null && repoProjectRepository.existsById(repoProject.getIdRepositorio());
	        if (exists) {
	            throw new IllegalArgumentException(repoProject.getIdRepositorio() + "");
	        }
	        return this.repoProjectMapper.toDTO(repoProjectRepository.save(this.repoProjectMapper.fromDTO(repoProject)));
	}

	public RepoProjectDTO update(RepoProjectDTO repoProject) {
		boolean exists = repoProjectRepository.existsById(repoProject.getIdRepositorio());
        if (!exists) {
            throw new NoSuchElementException(repoProject.getIdRepositorio() + "");
        }
        return this.repoProjectMapper.toDTO(repoProjectRepository.save(this.repoProjectMapper.fromDTO(repoProject)));
	}

	public void delete(Long id) {
		
		boolean exists = repoProjectRepository.existsById(id);
        if (!exists) {
            throw new NoSuchElementException(id + "");
        }
        repoProjectRepository.deleteById(id);
	}

	
}
