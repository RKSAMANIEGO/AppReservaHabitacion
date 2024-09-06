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

import com.cleanCode.App.RelacionEntidadV2.Model.Empleado;
import com.cleanCode.App.RelacionEntidadV2.Service.IEmpleadoService;

@RestController
@RequestMapping("/api/empleado")
public class EmpleadoController {
	
	@Autowired
	private IEmpleadoService empleadoS;
	
	
	@GetMapping("/getAllEmpleado")
	public List<Empleado> getAllEmpleado(){
		return empleadoS.listarEmpleado();
	}
	
	@PostMapping("/addEmpleado")
	public ResponseEntity<Empleado> addEmpleado(@RequestBody Empleado e){
		Empleado eN=empleadoS.agregarEmpleado(e);
		return new ResponseEntity<Empleado>(eN, HttpStatus.ACCEPTED);
	}

}
