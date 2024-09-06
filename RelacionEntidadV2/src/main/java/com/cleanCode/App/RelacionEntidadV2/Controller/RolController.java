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

import com.cleanCode.App.RelacionEntidadV2.Model.Rol;
import com.cleanCode.App.RelacionEntidadV2.Service.IRolService;

@RestController
@RequestMapping("/api/rol")
public class RolController {

	@Autowired
	private IRolService rolS;
	
	
	@GetMapping("/getAllRol")
	public List<Rol> getAllRol(){
		return rolS.listarRoles();
	}
	
	
	@PostMapping("/addRol")
	public ResponseEntity<Rol> addRol(@RequestBody Rol r){
		Rol rN=rolS.agregarRoles(r);
		return new ResponseEntity<Rol>(rN, HttpStatus.ACCEPTED);
	}
	
}
