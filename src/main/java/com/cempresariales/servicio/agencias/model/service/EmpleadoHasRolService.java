package com.cempresariales.servicio.agencias.model.service;

import java.util.List;

import com.cempresariales.servicio.commons.model.entity.EmpleadoHasRol;
import com.cempresariales.servicio.commons.model.entity.EmpleadoHasRolPK;

public interface EmpleadoHasRolService {

	public List<EmpleadoHasRol> findAll();

	public EmpleadoHasRol findById(EmpleadoHasRolPK id);

	public EmpleadoHasRol save(EmpleadoHasRol entidad);

	public void delete(EmpleadoHasRolPK id);
}
