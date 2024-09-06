package com.cleanCode.App.RelacionEntidadV2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleanCode.App.RelacionEntidadV2.Model.TipoHabitacion;
import com.cleanCode.App.RelacionEntidadV2.Repository.ITipoHabitacionRepository;

@Service
public class TipoHabitacionImplement implements ITipoHabitacionService{

	@Autowired
	private ITipoHabitacionRepository tipoHabitacionR;
	
	@Override
	public List<TipoHabitacion> listarTipoH() {
		return tipoHabitacionR.findAll();
	}

	@Override
	public TipoHabitacion agregarTipoH(TipoHabitacion th) {
		return tipoHabitacionR.save(th);
	}
	

}
