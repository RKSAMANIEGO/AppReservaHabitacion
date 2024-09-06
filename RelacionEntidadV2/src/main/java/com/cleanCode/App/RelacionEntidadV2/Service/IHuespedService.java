package com.cleanCode.App.RelacionEntidadV2.Service;

import java.util.List;

import com.cleanCode.App.RelacionEntidadV2.Model.Huesped;


public interface IHuespedService {
	
	List<Huesped> listarHuesped();
	Huesped agregarHuesped(Huesped h);
}
