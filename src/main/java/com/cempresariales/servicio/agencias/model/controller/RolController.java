package com.cempresariales.servicio.agencias.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cempresariales.servicio.agencias.model.service.RolServiceImp;
import com.cempresariales.servicio.commons.model.entity.Rol;


@RestController
public class RolController {

	@Autowired
	private RolServiceImp rolService;
	
	@GetMapping("/listarRoles")
	public List<Rol> listarRol(){
		return rolService.findAll();
	}
	
	@GetMapping("/Rol/{id}")
	public Rol verRol(@PathVariable Long id){
		return rolService.findById(id);
	}
	
	@PostMapping("/crearRol/{rol}")
	public Rol crear(@PathVariable Rol Rol){
		return rolService.save(Rol);
	}
	
	@DeleteMapping("/eliminarRol/{id}")
	public void eliminar(@PathVariable Long id){
		rolService.delete(id);
	}
}
