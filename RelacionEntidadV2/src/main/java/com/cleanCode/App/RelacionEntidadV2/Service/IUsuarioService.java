package com.cleanCode.App.RelacionEntidadV2.Service;

import java.util.List;

import com.cleanCode.App.RelacionEntidadV2.Model.Usuario;

public interface IUsuarioService {

	List<Usuario> listarUsuario();
	Usuario agregarUsuario(Usuario u);
	
}
