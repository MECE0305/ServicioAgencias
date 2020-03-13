package com.cempresariales.servicio.agencias.model.service;

import java.util.List;

import com.cempresariales.servicio.commons.model.entity.Agencia;

public interface IAgenciaService {
	public List<Agencia> findAll();
	public Agencia findById(Long id);
	public Agencia save(Agencia categoria);
	public void delete(Long id);
}
