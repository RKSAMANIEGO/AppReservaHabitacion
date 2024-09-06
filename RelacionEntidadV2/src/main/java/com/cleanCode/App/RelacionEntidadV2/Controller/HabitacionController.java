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

import com.cleanCode.App.RelacionEntidadV2.Model.Habitacion;
import com.cleanCode.App.RelacionEntidadV2.Service.IHabitacionService;

@RestController
@RequestMapping("/api/habitacion")
public class HabitacionController {
	
	@Autowired
	private IHabitacionService habitacionS;

	
	@GetMapping("/getAllHabitacion")
	public List<Habitacion> getAllHabitacion(){
		return habitacionS.listarHabitacion();
	}
	
	@PostMapping("/addHabitacion")
	public ResponseEntity<Habitacion> addHabitacion(@RequestBody Habitacion h){
		Habitacion hN= habitacionS.agregarHabitacion(h);
		return new ResponseEntity<Habitacion>(hN,HttpStatus.ACCEPTED);
	}
}
