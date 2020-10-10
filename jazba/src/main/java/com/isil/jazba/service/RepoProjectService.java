package com.isil.jazba.service;

import java.util.List;

import com.isil.jazba.dto.RepoProjectDTO;

public interface RepoProjectService {

	List<RepoProjectDTO> listAll();

	RepoProjectDTO getById(Long id);

	RepoProjectDTO save(RepoProjectDTO repoProject);

	RepoProjectDTO update(RepoProjectDTO repoProject);

	void delete(Long id);
}
