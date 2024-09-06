package com.cleanCode.App.RelacionEntidadV2.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	@Column(name = "usuario")
	private String usuario;
	@Column(name = "contrasexa")
	private String contrasexa;
	@Column(name = "estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name = "idRol", referencedColumnName = "idRol")
	private Rol roles;
	
	/*
	@OneToOne(targetEntity = Empleado.class)
	@JoinColumn(name = "id_empleado", referencedColumnName = "idEmpleado")
	private Empleado empleados;
	*/

	public Usuario() {
	
	}

	public Usuario(Long idUsuario, String usuario, String contrasexa, String estado, Rol roles) {
		super();
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.contrasexa = contrasexa;
		this.estado = estado;
		this.roles = roles;
	}
	
	/*
	public Usuario(Long idUsuario, String usuario, String contrasexa, String estado, Rol roles,Empleado empleados) {
		super();
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.contrasexa = contrasexa;
		this.estado = estado;
		this.roles = roles;
		this.empleados=empleados;
	}
	*/
	

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasexa() {
		return contrasexa;
	}

	public void setContrasexa(String contrasexa) {
		this.contrasexa = contrasexa;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Rol getRoles() {
		return roles;
	}

	public void setRoles(Rol roles) {
		this.roles = roles;
	}
	
	/*

	public Empleado getEmpleado() {
		return empleados;
	}

	public void setEmpleados(Empleado empleados) {
		this.empleados = empleados;
	}
	*/
	
	
	

}
