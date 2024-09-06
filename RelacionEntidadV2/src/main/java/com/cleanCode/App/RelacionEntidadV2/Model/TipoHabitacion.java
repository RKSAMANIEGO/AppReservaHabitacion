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
@Table(name = "tipo_habitacion")
public class TipoHabitacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTipo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "detalles")
	private String detalles;
	@Column(name = "nPersonas")
	private String nPersonas;
	

	@OneToMany(mappedBy = "Tipohabitaciones",cascade = CascadeType.PERSIST)
	@JsonIgnore
	private List<Habitacion> habitaciones;
	
	

	public TipoHabitacion() {
		super();
	}



	public TipoHabitacion(Long idTipo, String nombre, String detalles, String nPersonas,
			List<Habitacion> habitaciones) {
		super();
		this.idTipo = idTipo;
		this.nombre = nombre;
		this.detalles = detalles;
		this.nPersonas = nPersonas;
		this.habitaciones = habitaciones;
	}



	public Long getIdTipo() {
		return idTipo;
	}



	public void setIdTipo(Long idTipo) {
		this.idTipo = idTipo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDetalles() {
		return detalles;
	}



	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}



	public String getnPersonas() {
		return nPersonas;
	}



	public void setnPersonas(String nPersonas) {
		this.nPersonas = nPersonas;
	}



	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}



	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}


	
	

}
