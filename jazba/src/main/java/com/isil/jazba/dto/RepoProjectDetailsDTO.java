package com.isil.jazba.dto;

import java.util.Date;

public class RepoProjectDetailsDTO {

	private Long idDetalles;
	
	private String comentario;
	
	private Date fechahoraComentario;
	
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

	public RepoProjectDetailsDTO(Long idDetalles, String comentario, Date fechahoraComentario, int numLikes) {
		super();
		this.idDetalles = idDetalles;
		this.comentario = comentario;
		this.fechahoraComentario = fechahoraComentario;
		this.numLikes = numLikes;
	}

	public RepoProjectDetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
