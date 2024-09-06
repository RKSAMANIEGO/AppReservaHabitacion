package com.cleanCode.App.RelacionEntidadV2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleanCode.App.RelacionEntidadV2.Model.Habitacion;
import com.cleanCode.App.RelacionEntidadV2.Repository.IHabitacionRepository;

@Service
public class HabitacionImplement implements IHabitacionService{

	@Autowired
	private IHabitacionRepository habitacionR;
	
	@Override
	public List<Habitacion> listarHabitacion() {
		return habitacionR.findAll();
	}

	@Override
	public Habitacion agregarHabitacion(Habitacion h) {
		return habitacionR.save(h);
	}

	
	
}
