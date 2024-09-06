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
@Table(name = "reservas")
public class Reservas {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long idReserva;
	@Column(name = "fechaIngreso")
	private String fechaIngreso;
	@Column(name = "fechaSalida")
	private String fechaSalida;
	@Column(name = "nDias")
	private int nDias;
	@Column(name = "nPersonas")
	private int nPersonas;
	@Column(name = "fechaRegistro")
	private String fechaRegistro;
	@Column(name = "montoPagar")
	private double montoPagar;
	@Column(name = "estado")
	private String estado;
	
	@ManyToOne()
	@JoinColumn(name = "codHuesped", referencedColumnName = "idHuesped")
	private Huesped huesped;
	
	public Reservas() {
	}

	public Reservas(Long idReserva, String fechaIngreso, String fechaSalida, int nDias, int nPersonas,
			String fechaRegistro, double montoPagar, String estado, Huesped huesped) {
		super();
		this.idReserva = idReserva;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.nDias = nDias;
		this.nPersonas = nPersonas;
		this.fechaRegistro = fechaRegistro;
		this.montoPagar = montoPagar;
		this.estado = estado;
		this.huesped = huesped;
	}

	public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getnDias() {
		return nDias;
	}

	public void setnDias(int nDias) {
		this.nDias = nDias;
	}

	public int getnPersonas() {
		return nPersonas;
	}

	public void setnPersonas(int nPersonas) {
		this.nPersonas = nPersonas;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public double getMontoPagar() {
		return montoPagar;
	}

	public void setMontoPagar(double montoPagar) {
		this.montoPagar = montoPagar;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Huesped getHuesped() {
		return huesped;
	}

	public void setHuesped(Huesped huesped) {
		this.huesped = huesped;
	}	

	

	
	
	
	
	
	
	
}
