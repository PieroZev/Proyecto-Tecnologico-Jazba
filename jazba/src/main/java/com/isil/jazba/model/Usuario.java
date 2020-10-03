package com.isil.jazba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario {

	@Column(nullable=false)
	@Id
	private Long dni;
	
	@Column(nullable=false)
	private String nombre;
	
	@Column(nullable=false)
	private String apePaterno;
	
	@Column(nullable=false)
	private String apeMaterno;
	
	@Column(nullable=false)
	private String correo;
	
	@Column(nullable=false)
	private String password;
	
	@Column
	private int celular;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idInstitucion", nullable = false)
	private int idInstitucion;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idTipo", nullable = false)
	private int idTipo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idEspecialidad", nullable = false)
	private int idEspecialidad;

	public Usuario(Long dni, String nombre, String apePaterno, String apeMaterno, String correo, String password,
			int celular, int idInstitucion, int idTipo, int idEspecialidad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apePaterno = apePaterno;
		this.apeMaterno = apeMaterno;
		this.correo = correo;
		this.password = password;
		this.celular = celular;
		this.idInstitucion = idInstitucion;
		this.idTipo = idTipo;
		this.idEspecialidad = idEspecialidad;
	}

	public Usuario(String correo, String password) {
		super();
		this.correo = correo;
		this.password = password;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApePaterno() {
		return apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	public String getApeMaterno() {
		return apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public int getIdInstitucion() {
		return idInstitucion;
	}

	public void setIdInstitucion(int idInstitucion) {
		this.idInstitucion = idInstitucion;
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}
	
}
