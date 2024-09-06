package com.cleanCode.App.RelacionEntidadV2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleanCode.App.RelacionEntidadV2.Model.Reservas;
import com.cleanCode.App.RelacionEntidadV2.Repository.IReservasRepository;

@Service
public class ReservasImplement implements IReservasService{

	@Autowired
	private IReservasRepository reservaR;
	
	@Override
	public List<Reservas> listarReservas() {
		return reservaR.findAll();
	}

	@Override
	public Reservas agregarReservas(Reservas r) {
		return reservaR.save(r);
	}
	

}
