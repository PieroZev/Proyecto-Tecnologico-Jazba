package com.isil.jazba.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.isil.jazba.dto.RepoProjectDTO;
import com.isil.jazba.dto.RepoProjectDetailsDTO;
import com.isil.jazba.mapper.RepoProjectDetailsMapper;
import com.isil.jazba.mapper.RepoProjectMapper;
import com.isil.jazba.repository.RepoProjectDetailsRepository;
import com.isil.jazba.repository.RepoProjectRepository;

public class RepoProjectDetailsServiceImpl implements RepoProjectDetailsService {
	
	@Autowired
	private RepoProjectDetailsRepository repoProjectDetailsRepository;
	@Autowired
    private RepoProjectDetailsMapper repoProjectDetailsMapper;
	
	public List<RepoProjectDetailsDTO> listAll() {
		
		List<RepoProjectDetailsDTO> listaProyectos = new ArrayList<RepoProjectDetailsDTO>();
		
		listaProyectos = repoProjectDetailsRepository.findAll().stream()
                .map(repoProjectDetailsMapper::toDTO)
                .collect(Collectors.toList());
		
		return listaProyectos;
	}

	public RepoProjectDetailsDTO getById(Long id) {
	        return repoProjectDetailsRepository.findById(id).map(repoProjectDetailsMapper::toDTO)
	                .orElseThrow(() -> new NoSuchElementException(id+""));
	}

	public RepoProjectDetailsDTO save(RepoProjectDetailsDTO repoProject) {
		 boolean exists = repoProject.getIdDetalles() != null && repoProjectDetailsRepository.existsById(repoProject.getIdDetalles());
	        if (exists) {
	            throw new IllegalArgumentException(repoProject.getIdDetalles() + "");
	        }
	        return this.repoProjectDetailsMapper.toDTO(repoProjectDetailsRepository.save(this.repoProjectDetailsMapper.fromDTO(repoProject)));
	}

	public RepoProjectDetailsDTO update(RepoProjectDetailsDTO repoProject) {
		boolean exists = repoProjectDetailsRepository.existsById(repoProject.getIdDetalles());
        if (!exists) {
            throw new NoSuchElementException(repoProject.getIdDetalles() + "");
        }
        return this.repoProjectDetailsMapper.toDTO(repoProjectDetailsRepository.save(this.repoProjectDetailsMapper.fromDTO(repoProject)));
	}

	public void delete(Long id) {
		
		boolean exists = repoProjectDetailsRepository.existsById(id);
        if (!exists) {
            throw new NoSuchElementException(id + "");
        }
        repoProjectDetailsRepository.deleteById(id);
	}

}
