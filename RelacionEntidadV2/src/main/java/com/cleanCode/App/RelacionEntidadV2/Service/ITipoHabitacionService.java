package com.cleanCode.App.RelacionEntidadV2.Service;

import java.util.List;

import com.cleanCode.App.RelacionEntidadV2.Model.TipoHabitacion;


public interface ITipoHabitacionService {
	
	List<TipoHabitacion> listarTipoH();
	TipoHabitacion agregarTipoH(TipoHabitacion th);

}
