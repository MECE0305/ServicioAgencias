package com.cempresariales.servicio.agencias.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cempresariales.servicio.commons.model.entity.Agencia;
import com.cempresariales.servicio.commons.model.entity.Empresa;

public interface AgenciaDao extends JpaRepository<Agencia, Long>{
	
	List<Agencia> findByEmpresaIdEmpresa(Empresa empresaIdEmpresa);
	

}
