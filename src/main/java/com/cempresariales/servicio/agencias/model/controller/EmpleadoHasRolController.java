package com.cempresariales.servicio.agencias.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cempresariales.servicio.agencias.model.service.EmpleadoHasRolServiceImp;
import com.cempresariales.servicio.commons.model.entity.EmpleadoHasRol;
import com.cempresariales.servicio.commons.model.entity.EmpleadoHasRolPK;

@RestController
@RequestMapping(value = "empleado")
public class EmpleadoHasRolController {

	@Autowired
	private EmpleadoHasRolServiceImp repo;

	@GetMapping("/listar")
	public List<EmpleadoHasRol> listarAgencias() {
		return repo.findAll();
	}

	@GetMapping("/ver/{id}")
	public EmpleadoHasRol verAgencia(@PathVariable EmpleadoHasRolPK id) {
		return repo.findById(id);
	}

	@PostMapping("/crear")
	public EmpleadoHasRol crear(@RequestBody EmpleadoHasRol agencia) {
		return repo.save(agencia);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable EmpleadoHasRolPK id) {
		repo.delete(id);
	}
}
