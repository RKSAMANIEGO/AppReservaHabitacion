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

import com.cleanCode.App.RelacionEntidadV2.Model.Usuario;
import com.cleanCode.App.RelacionEntidadV2.Service.IUsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
	
	@Autowired
	private IUsuarioService usuarioS;
	
	
	@GetMapping("/getAllUsuario")
	public List<Usuario> getAllUsuario(){
		return usuarioS.listarUsuario();
	}
	
	@PostMapping("/addUsuario")
	public ResponseEntity<Usuario> addUsuario(@RequestBody Usuario u){
		Usuario uN= usuarioS.agregarUsuario(u);
		return new ResponseEntity<Usuario>(uN, HttpStatus.ACCEPTED);
	}

}
