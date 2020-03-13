package com.cempresariales.servicio.agencias.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cempresariales.servicio.agencias.model.service.EmpleadoServiceImp;
import com.cempresariales.servicio.commons.model.entity.Empleado;



@RestController
public class EmpleadoController {

	@Autowired
	private EmpleadoServiceImp empleadoService;
	
	@GetMapping("/listarEmpleados")
	public List<Empleado> listarEmpleado(){
		return empleadoService.findAll();
	}
	
	@GetMapping("/empleado/{id}")
	public Empleado verItem(@PathVariable Long id){
		return empleadoService.findById(id);
	}
	
	@PostMapping("/crearEmpleado/{empleado}")
	public Empleado crear(@PathVariable Empleado empleado){
		return empleadoService.save(empleado);
	}
	
	@DeleteMapping("/eliminarEmpleado/{id}")
	public void eliminar(@PathVariable Long id){
		empleadoService.delete(id);
	}
}
