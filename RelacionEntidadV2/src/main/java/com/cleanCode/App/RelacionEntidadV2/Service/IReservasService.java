package com.cleanCode.App.RelacionEntidadV2.Service;

import java.util.List;

import com.cleanCode.App.RelacionEntidadV2.Model.Reservas;


public interface IReservasService {

		List<Reservas> listarReservas();
		Reservas agregarReservas(Reservas r);
}
