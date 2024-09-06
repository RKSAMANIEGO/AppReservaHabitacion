package com.cleanCode.App.RelacionEntidadV2.Model;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "huesped")
public class Huesped {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idHuesped;
	@Column(name = "nombres", length = 40)
	private String nombres;
	@Column(name = "dni", length = 40)
	private String dni;
	@Column(name = "fechaNac", length = 40)
	private String fechaNac;
	@Column(name = "celular", length = 40)
	private String celular;
	@Column(name = "correo", length = 40)
	private String correo;
	@Column(name = "estado", length = 40)
	private String estado;
	

	@OneToMany(mappedBy = "huesped",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Reservas> reservas;

	
	//contructor
	public Huesped() {
	
	}


	public Huesped(Long idHuesped, String nombres, String dni, String fechaNac, String celular, String correo,
			String estado, List<Reservas> reservas) {
		super();
		this.idHuesped = idHuesped;
		this.nombres = nombres;
		this.dni = dni;
		this.fechaNac = fechaNac;
		this.celular = celular;
		this.correo = correo;
		this.estado = estado;
		this.reservas = reservas;
	}


	public Long getIdHuesped() {
		return idHuesped;
	}


	public void setIdHuesped(Long idHuesped) {
		this.idHuesped = idHuesped;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public List<Reservas> getReservas() {
		return reservas;
	}


	public void setReservas(List<Reservas> reservas) {
		this.reservas = reservas;
	}

	
	

	

	
}
