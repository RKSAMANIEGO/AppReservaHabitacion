package com.cleanCode.App.RelacionEntidadV2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleanCode.App.RelacionEntidadV2.Model.Huesped;
import com.cleanCode.App.RelacionEntidadV2.Repository.IHuespedRepository;


@Service
public class HuespedImplement implements IHuespedService {

	@Autowired
	private IHuespedRepository huespedR;
	
	@Override
	public List<Huesped> listarHuesped() {
		return huespedR.findAll();
	}

	@Override
	public Huesped agregarHuesped(Huesped h) {
		return huespedR.save(h);
	}

	
	
}
