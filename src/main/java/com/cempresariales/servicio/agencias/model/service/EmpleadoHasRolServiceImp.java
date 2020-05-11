package com.cempresariales.servicio.agencias.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cempresariales.servicio.agencias.model.dao.EmpleadoHasRolDao;
import com.cempresariales.servicio.commons.model.entity.EmpleadoHasRol;
import com.cempresariales.servicio.commons.model.entity.EmpleadoHasRolPK;

@Service
public class EmpleadoHasRolServiceImp implements EmpleadoHasRolService {

	@Autowired
	private EmpleadoHasRolDao repo;

	@Override
	public List<EmpleadoHasRol> findAll() {
		return repo.findAll();
	}

	@Override
	public EmpleadoHasRol findById(EmpleadoHasRolPK id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public EmpleadoHasRol save(EmpleadoHasRol entidad) {
		return repo.save(entidad);
	}

	@Override
	public void delete(EmpleadoHasRolPK id) {
		repo.deleteById(id);
	}

}
