package com.cempresariales.servicio.agencias.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cempresariales.servicio.commons.model.entity.EmpleadoHasRol;
import com.cempresariales.servicio.commons.model.entity.EmpleadoHasRolPK;

public interface EmpleadoHasRolDao extends JpaRepository<EmpleadoHasRol, EmpleadoHasRolPK> {

}
