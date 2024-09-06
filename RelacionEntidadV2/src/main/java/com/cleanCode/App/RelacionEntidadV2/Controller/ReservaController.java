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

import com.cleanCode.App.RelacionEntidadV2.Model.Reservas;
import com.cleanCode.App.RelacionEntidadV2.Service.IReservasService;


@RestController
@RequestMapping("/api/reserva")
public class ReservaController {
	
	@Autowired
	private IReservasService reservaS;
	
	
	@GetMapping("/getAllReserva")
	public List<Reservas> getAllReservas(){
		return reservaS.listarReservas();
	}
	
	@PostMapping("/addReserva")
	public ResponseEntity<Reservas> addReservas(@RequestBody Reservas r){
		Reservas rN=reservaS.agregarReservas(r);
		return new ResponseEntity<Reservas>(rN, HttpStatus.ACCEPTED);
	}

}
