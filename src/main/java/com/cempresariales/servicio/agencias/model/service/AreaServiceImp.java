package com.cempresariales.servicio.agencias.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cempresariales.servicio.agencias.model.dao.AreaDao;
import com.cempresariales.servicio.commons.model.entity.Area;

@Service
public class AreaServiceImp implements AreaService {

	@Autowired
	private AreaDao rolDao;
	
	@Override
	public List<Area> findAll() {
		return rolDao.findAll();
	}

	@Override
	public Area findById(Long id) {
		return rolDao.findById(id).orElse(null);
	}

	@Override
	public Area save(Area rol) {
		return rolDao.save(rol);
	}

	@Override
	public void delete(Long id) {
		rolDao.deleteById(id);
	}

}
