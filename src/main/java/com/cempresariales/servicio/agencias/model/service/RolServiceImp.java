package com.cempresariales.servicio.agencias.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cempresariales.servicio.agencias.model.dao.RolDao;
import com.cempresariales.servicio.commons.model.entity.Rol;

@Service
public class RolServiceImp implements IRolService {

	@Autowired
	private RolDao rolDao;
	
	@Override
	public List<Rol> findAll() {
		return rolDao.findAll();
	}

	@Override
	public Rol findById(Long id) {
		return rolDao.findById(id).orElse(null);
	}

	@Override
	public Rol save(Rol rol) {
		return rolDao.save(rol);
	}

	@Override
	public void delete(Long id) {
		rolDao.deleteById(id);
	}

}
