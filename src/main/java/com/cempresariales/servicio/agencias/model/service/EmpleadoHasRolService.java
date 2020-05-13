package com.cempresariales.servicio.agencias.model.service;

import java.util.List;

import com.cempresariales.servicio.commons.model.entity.RolHasEmpleado;
import com.cempresariales.servicio.commons.model.entity.RolHasEmpleadoPK;

public interface EmpleadoHasRolService {

	public List<RolHasEmpleado> findAll();

	public RolHasEmpleado findById(RolHasEmpleadoPK id);

	public RolHasEmpleado save(RolHasEmpleado entidad);

	public void delete(RolHasEmpleadoPK id);
}
