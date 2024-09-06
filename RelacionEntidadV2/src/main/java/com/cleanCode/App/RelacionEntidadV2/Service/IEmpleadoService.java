package com.cleanCode.App.RelacionEntidadV2.Service;

import java.util.List;

import com.cleanCode.App.RelacionEntidadV2.Model.Empleado;

public interface IEmpleadoService {

	List<Empleado> listarEmpleado();
	Empleado agregarEmpleado(Empleado e);
}
