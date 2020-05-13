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
import com.cempresariales.servicio.commons.model.entity.RolHasEmpleado;
import com.cempresariales.servicio.commons.model.entity.RolHasEmpleadoPK;

@RestController
@RequestMapping(value = "empleadorol")
public class EmpleadoHasRolController {

	@Autowired
	private EmpleadoHasRolServiceImp repo;

	@GetMapping("/listar")
	public List<RolHasEmpleado> listarAgencias() {
		return repo.findAll();
	}

	@GetMapping("/ver/{id}")
	public RolHasEmpleado verAgencia(@PathVariable RolHasEmpleadoPK id) {
		return repo.findById(id);
	}

	@PostMapping("/crear")
	public RolHasEmpleado crear(@RequestBody RolHasEmpleado agencia) {
		return repo.save(agencia);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable RolHasEmpleadoPK id) {
		repo.delete(id);
	}
}
