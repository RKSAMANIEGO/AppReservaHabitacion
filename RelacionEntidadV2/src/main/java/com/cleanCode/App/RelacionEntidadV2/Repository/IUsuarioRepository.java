package com.cleanCode.App.RelacionEntidadV2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleanCode.App.RelacionEntidadV2.Model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario,Long>{

}
