package com.isil.jazba.model;

import java.util.Date;

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
@Table(name="repoproyectosdetalles")
public class RepoProjectDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDetalles;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idRepositorio", nullable = false)
	private int idRepositorio;
	
	@Column(nullable=false)
	private String comentario;
	
	@Column(nullable=false)
	private Date fechahoraComentario;
	
	@Column(nullable=false)
	private int numLikes;

	public Long getIdDetalles() {
		return idDetalles;
	}

	public void setIdDetalles(Long idDetalles) {
		this.idDetalles = idDetalles;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Date getFechahoraComentario() {
		return fechahoraComentario;
	}

	public void setFechahoraComentario(Date fechahoraComentario) {
		this.fechahoraComentario = fechahoraComentario;
	}

	public int getNumLikes() {
		return numLikes;
	}

	public void setNumLikes(int numLikes) {
		this.numLikes = numLikes;
	}

	public RepoProjectDetails(Long idDetalles, String comentario, Date fechahoraComentario, int numLikes) {
		super();
		this.idDetalles = idDetalles;
		this.comentario = comentario;
		this.fechahoraComentario = fechahoraComentario;
		this.numLikes = numLikes;
	}

	public RepoProjectDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
