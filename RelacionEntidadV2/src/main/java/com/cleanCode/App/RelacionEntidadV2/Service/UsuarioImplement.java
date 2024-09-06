package com.cleanCode.App.RelacionEntidadV2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleanCode.App.RelacionEntidadV2.Model.Usuario;
import com.cleanCode.App.RelacionEntidadV2.Repository.IUsuarioRepository;

@Service
public class UsuarioImplement implements IUsuarioService{

	@Autowired
	private IUsuarioRepository usuarioR;
	
	@Override
	public List<Usuario> listarUsuario() {
		return usuarioR.findAll();
	}

	@Override
	public Usuario agregarUsuario(Usuario u) {
		return usuarioR.save(u);
	}
	

}
