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

import com.cleanCode.App.RelacionEntidadV2.Model.Huesped;
import com.cleanCode.App.RelacionEntidadV2.Service.IHuespedService;

@RestController
@RequestMapping("/api/huesped")
public class HuespedController {
	
	@Autowired
	private IHuespedService huespedS;
	
	
	@GetMapping("/getAllHuesped")
	public List<Huesped> getAllHuesped(){
		return huespedS.listarHuesped();
	}
	
	@PostMapping("/addHuesped")
	public ResponseEntity<Huesped> addHuesped(@RequestBody Huesped h){
		Huesped hN=huespedS.agregarHuesped(h);
		return new ResponseEntity<Huesped>(hN,HttpStatus.ACCEPTED);
	}
}
