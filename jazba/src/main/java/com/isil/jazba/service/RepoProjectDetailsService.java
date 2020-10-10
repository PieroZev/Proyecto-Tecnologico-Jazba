package com.isil.jazba.service;

import java.util.List;

import com.isil.jazba.dto.RepoProjectDetailsDTO;

public interface RepoProjectDetailsService {

	List<RepoProjectDetailsDTO> listAll();

	RepoProjectDetailsDTO getById(Long id);

	RepoProjectDetailsDTO save(RepoProjectDetailsDTO repoProjectDetails);

	RepoProjectDetailsDTO update(RepoProjectDetailsDTO repoProjectDetails);

	void delete(Long id);
	
}
