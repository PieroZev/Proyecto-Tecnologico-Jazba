package com.isil.jazba.model;

import java.sql.Blob;

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
	private String apePat;
	
	@Column(nullable=false)
	private String apeMat;
	
	@Column(nullable=false)
	private String correo;
	
	@Column(nullable=false)
	private String password;
	
	@Column
	private int celular;
	
	@Column
	private Blob fileComprobante;
	
	@Column
	private Long idInstitucion;
	
	@Column
	private Long idTipo;
	  
	@Column 
	  private Long idEspecialidad;
	 

	public Usuario(String correo, String password) {
		super();
		this.correo = correo;
		this.password = password;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(Long dni, String nombre, String apePaterno, String apeMaterno, String correo, String password,
			int celular, Long idInstitucion, Long idTipo, Long idEspecialidad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apePat = apePaterno;
		this.apeMat = apeMaterno;
		this.correo = correo;
		this.password = password;
		this.celular = celular;
		this.idInstitucion = idInstitucion;
		this.idTipo = idTipo;
		this.idEspecialidad = idEspecialidad;
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
		return apePat;
	}

	public void setApePaterno(String apePaterno) {
		this.apePat = apePaterno;
	}

	public String getApeMaterno() {
		return apeMat;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMat = apeMaterno;
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

	
	  public Long getIdInstitucion() { return idInstitucion; }
	  
	  public void setIdInstitucion(Long idInstitucion) { this.idInstitucion =
	  idInstitucion; }
	  
	  public Long getIdTipo() { return idTipo; }
	  
	  public void setIdTipo(Long idTipo) { this.idTipo = idTipo; }
	  
	  public Long getIdEspecialidad() { return idEspecialidad; }
	  
	  public void setIdEspecialidad(Long idEspecialidad) { this.idEspecialidad =
	  idEspecialidad; }
	 
	
}
