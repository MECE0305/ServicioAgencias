package com.cempresariales.servicio.agencias.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cempresariales.servicio.agencias.model.dao.EmpleadoDao;
import com.cempresariales.servicio.commons.model.entity.Agencia;
import com.cempresariales.servicio.commons.model.entity.Empleado;


@Service
public class EmpleadoServiceImp implements IEmpleadoService {

	@Autowired
	private EmpleadoDao empleadoDao;
	
	@Override
	public List<Empleado> findAll() {
		return (List<Empleado>) empleadoDao.findAll();
	}

	@Override
	public Empleado findById(Long id) {
		return empleadoDao.findById(id).orElse(null);
	}

	@Override
	public Empleado save(Empleado empleado) {
		return empleadoDao.save(empleado);
	}

	@Override
	public void delete(Long id) {
		empleadoDao.deleteById(id);
	}

	@Override
	public List<Empleado> findByAgenciaIdAgencia(Agencia agencia) {
		return empleadoDao.findByAgenciaIdAgencia(agencia);
	}

}
