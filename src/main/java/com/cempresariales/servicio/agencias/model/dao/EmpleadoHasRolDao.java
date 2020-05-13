package com.cempresariales.servicio.agencias.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cempresariales.servicio.commons.model.entity.RolHasEmpleado;
import com.cempresariales.servicio.commons.model.entity.RolHasEmpleadoPK;

public interface EmpleadoHasRolDao extends JpaRepository<RolHasEmpleado, RolHasEmpleadoPK> {

}
