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

import com.cempresariales.servicio.agencias.model.service.EmpleadoServiceImp;
import com.cempresariales.servicio.commons.model.entity.Empleado;



@RestController
@RequestMapping(value = "empleado")
public class EmpleadoController {

	@Autowired
	private EmpleadoServiceImp empleadoService;
	
	@GetMapping("/listar")
	public List<Empleado> listarEmpleado(){
		return empleadoService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Empleado verItem(@PathVariable Long id){
		return empleadoService.findById(id);
	}
	
	@PostMapping("/crear")
	public Empleado crear(@RequestBody Empleado empleado){
		return empleadoService.save(empleado);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Long id){
		empleadoService.delete(id);
	}
}
