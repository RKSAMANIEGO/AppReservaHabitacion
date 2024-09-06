package com.cleanCode.App.RelacionEntidadV2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleanCode.App.RelacionEntidadV2.Model.Empleado;
import com.cleanCode.App.RelacionEntidadV2.Repository.IEmpleadoRepository;

@Service
public class EmpleadoImplement implements IEmpleadoService{

	@Autowired
	private IEmpleadoRepository empleadoR;
	
	@Override
	public List<Empleado> listarEmpleado() {
		return empleadoR.findAll();
	}

	@Override
	public Empleado agregarEmpleado(Empleado e) {
		return empleadoR.save(e);
	}
	

}
