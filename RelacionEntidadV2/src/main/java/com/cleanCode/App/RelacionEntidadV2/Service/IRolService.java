package com.cleanCode.App.RelacionEntidadV2.Service;

import java.util.List;

import com.cleanCode.App.RelacionEntidadV2.Model.Rol;

public interface IRolService {

	List<Rol> listarRoles();
	Rol agregarRoles(Rol r);
	
}
