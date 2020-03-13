package com.cempresariales.servicio.agencias.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cempresariales.servicio.agencias.model.dao.AgenciaDao;
import com.cempresariales.servicio.commons.model.entity.Agencia;

@Service
public class AgenciaServiceImp implements IAgenciaService{

	@Autowired
	private AgenciaDao agenciaDao;
	
	@Override
	public List<Agencia> findAll() {	
		return (List<Agencia>) agenciaDao.findAll();
	}

	@Override
	public Agencia findById(Long id) {
		return agenciaDao.findById(id).orElse(null);
	}

	@Override
	public Agencia save(Agencia agencia) {
		return agenciaDao.save(agencia);
	}

	@Override
	public void delete(Long id) {
		agenciaDao.deleteById(id);
	}

}
