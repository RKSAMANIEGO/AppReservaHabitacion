package com.cleanCode.App.RelacionEntidadV2.Service;

import java.util.List;

import com.cleanCode.App.RelacionEntidadV2.Model.Habitacion;

public interface IHabitacionService {
	
	List<Habitacion> listarHabitacion();
	Habitacion agregarHabitacion(Habitacion h);

}
