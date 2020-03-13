package com.cempresariales.servicio.agencias.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cempresariales.servicio.commons.model.entity.Empleado;

public interface EmpleadoDao extends JpaRepository<Empleado, Long>{

}
