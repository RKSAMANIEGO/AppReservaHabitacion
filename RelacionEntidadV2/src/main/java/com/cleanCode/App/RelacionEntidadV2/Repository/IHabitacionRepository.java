package com.cleanCode.App.RelacionEntidadV2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleanCode.App.RelacionEntidadV2.Model.Habitacion;

public interface IHabitacionRepository extends JpaRepository<Habitacion,Long> {

}
