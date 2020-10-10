package com.isil.jazba.dto;

import java.util.List;

import com.isil.jazba.model.RepoProjectDetails;

public class RepoProjectDTO {
	
	private Long idRepositorio;
	
	private String filename;
	
	private String uploadRepo;
	
	private String descripcion;

	public Long getIdRepositorio() {
		return idRepositorio;
	}

	public void setIdRepositorio(Long idRepositorio) {
		this.idRepositorio = idRepositorio;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getUploadRepo() {
		return uploadRepo;
	}

	public void setUploadRepo(String uploadRepo) {
		this.uploadRepo = uploadRepo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public RepoProjectDTO(Long idRepositorio, String filename, String uploadRepo, String descripcion) {
		super();
		this.idRepositorio = idRepositorio;
		this.filename = filename;
		this.uploadRepo = uploadRepo;
		this.descripcion = descripcion;
	}

	public RepoProjectDTO() {
		super();
	}
}
