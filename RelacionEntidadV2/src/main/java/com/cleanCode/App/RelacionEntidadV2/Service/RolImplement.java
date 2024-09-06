package com.cleanCode.App.RelacionEntidadV2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleanCode.App.RelacionEntidadV2.Model.Rol;
import com.cleanCode.App.RelacionEntidadV2.Repository.IRolRepository;

@Service
public class RolImplement implements IRolService{

	@Autowired
	private IRolRepository rolR;
	
	@Override
	public List<Rol> listarRoles() {
		return rolR.findAll();
	}

	@Override
	public Rol agregarRoles(Rol r) {
		return rolR.save(r);
	}

}
