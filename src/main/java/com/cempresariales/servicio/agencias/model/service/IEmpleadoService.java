package com.cempresariales.servicio.agencias.model.service;

import java.util.List;

import com.cempresariales.servicio.commons.model.entity.Empleado;


public interface IEmpleadoService {
	public List<Empleado> findAll();
	public Empleado findById(Long id);
	public Empleado save(Empleado categoria);
	public void delete(Long id);
}
