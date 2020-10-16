package com.isil.jazba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isil.jazba.model.RepoProjectDetails;

@Repository
public interface RepoProjectDetailsRepository extends JpaRepository<RepoProjectDetails, Long> {

}
