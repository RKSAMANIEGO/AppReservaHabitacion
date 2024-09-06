package com.cleanCode.App.RelacionEntidadV2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cleanCode.App.RelacionEntidadV2.Model.TipoHabitacion;
import com.cleanCode.App.RelacionEntidadV2.Service.ITipoHabitacionService;

@RestController
@RequestMapping("/api/tipoHabitacion")
public class TipoHabitacionController {
	
	@Autowired
	private ITipoHabitacionService tipoHabitacionS;
	
	
	@GetMapping("/getAllTipoHabitacion")
	public List<TipoHabitacion> getAllTipoHabitacion(){
		return tipoHabitacionS.listarTipoH();
	}
	
	
	@PostMapping("/addTipoHabitacion")
	public ResponseEntity<TipoHabitacion> addTipoHabitacion(@RequestBody TipoHabitacion th){
		TipoHabitacion thN=tipoHabitacionS.agregarTipoH(th);
		return new ResponseEntity<TipoHabitacion>(thN, HttpStatus.ACCEPTED);
	}

}
