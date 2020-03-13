package com.cempresariales.servicio.agencias.model.service;

import java.util.List;

import com.cempresariales.servicio.commons.model.entity.Rol;


public interface IRolService {

	public List<Rol> findAll();
	public Rol findById(Long id);
	public Rol save(Rol categoria);
	public void delete(Long id);
}
