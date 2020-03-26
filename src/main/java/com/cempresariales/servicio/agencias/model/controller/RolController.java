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

import com.cempresariales.servicio.agencias.model.service.RolServiceImp;
import com.cempresariales.servicio.commons.model.entity.Rol;


@RestController
@RequestMapping(value = "rol")
public class RolController {

	@Autowired
	private RolServiceImp rolService;
	
	@GetMapping("/listar")
	public List<Rol> listarRol(){
		return rolService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Rol verRol(@PathVariable Long id){
		return rolService.findById(id);
	}
	
	@PostMapping("/crear")
	public Rol crear(@RequestBody Rol Rol){
		return rolService.save(Rol);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Long id){
		rolService.delete(id);
	}
}
