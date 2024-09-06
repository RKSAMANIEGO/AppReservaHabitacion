package com.cleanCode.App.RelacionEntidadV2.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "habitacion")
public class Habitacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdHabitacion;
	@Column(name = "nombres")
	private String nombres;
	@Column(name = "nPisos")
	private int nPisos;
	@Column(name = "precioDia")
	private Double precioDia;
	@Column(name = "estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name = "idTipoHabitacion",referencedColumnName = "idTipo")
	private TipoHabitacion Tipohabitaciones;

	public Habitacion() {
	
	}

	public Habitacion(Long idHabitacion, String nombres, int nPisos, Double precioDia, String estado,
			TipoHabitacion tipohabitaciones) {
		super();
		IdHabitacion = idHabitacion;
		this.nombres = nombres;
		this.nPisos = nPisos;
		this.precioDia = precioDia;
		this.estado = estado;
		Tipohabitaciones = tipohabitaciones;
	}

	public Long getIdHabitacion() {
		return IdHabitacion;
	}

	public void setIdHabitacion(Long idHabitacion) {
		IdHabitacion = idHabitacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public int getnPisos() {
		return nPisos;
	}

	public void setnPisos(int nPisos) {
		this.nPisos = nPisos;
	}

	public Double getPrecioDia() {
		return precioDia;
	}

	public void setPrecioDia(Double precioDia) {
		this.precioDia = precioDia;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public TipoHabitacion getTipohabitaciones() {
		return Tipohabitaciones;
	}

	public void setTipohabitaciones(TipoHabitacion tipohabitaciones) {
		Tipohabitaciones = tipohabitaciones;
	}

	
	
	
	
	
	

}
