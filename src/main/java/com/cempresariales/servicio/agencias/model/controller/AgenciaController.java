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

import com.cempresariales.servicio.agencias.model.service.AgenciaServiceImp;
import com.cempresariales.servicio.commons.model.entity.Agencia;


@RestController
@RequestMapping(value = "agencia")
public class AgenciaController {

	@Autowired
	private AgenciaServiceImp agenciaService;
	
	@GetMapping("/listar")
	public List<Agencia> listarAgencias(){
		return agenciaService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Agencia verAgencia(@PathVariable Long id){
		return agenciaService.findById(id);
	}
	
	@PostMapping("/crear")
	public Agencia crear(@RequestBody Agencia agencia){
		return agenciaService.save(agencia);
	}
	
	@DeleteMapping("/eliminarAgencia/{id}")
	public void eliminar(@PathVariable Long id){
		agenciaService.delete(id);
	}
}
