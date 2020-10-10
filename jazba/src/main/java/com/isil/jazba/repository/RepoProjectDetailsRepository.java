package com.isil.jazba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isil.jazba.model.RepoProjectDetails;

public interface RepoProjectDetailsRepository extends JpaRepository<RepoProjectDetails, Long> {

	List<RepoProjectDetails> findAllByIdRepositorio(int id);
}
