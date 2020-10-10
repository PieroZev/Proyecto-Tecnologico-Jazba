package com.isil.jazba.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="repoproyectos")
public class RepoProject {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long idRepositorio;
	
	@Column(nullable=false)
	private String filename;
	
	@Column(nullable=false)
	private String uploadRepo;
	
	@Column(nullable=false)
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

	public RepoProject(Long idRepositorio, String filename, String uploadRepo, String descripcion) {
		super();
		this.idRepositorio = idRepositorio;
		this.filename = filename;
		this.uploadRepo = uploadRepo;
		this.descripcion = descripcion;
	}

	public RepoProject() {
		super();
	}
	
}
