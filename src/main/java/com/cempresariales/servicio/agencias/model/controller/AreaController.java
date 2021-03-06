package com.cempresariales.servicio.agencias.model.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cempresariales.servicio.agencias.model.service.AreaServiceImp;
import com.cempresariales.servicio.commons.model.entity.Area;
import com.cempresariales.servicio.commons.model.entity.Rol;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.OPTIONS })
@RequestMapping(value = "area")
public class AreaController {

	@Autowired
	private AreaServiceImp repo;

	@GetMapping("/listar")
	public List<Area> listarRol() {
		return repo.findAll();
	}

	@GetMapping("/ver/{id}")
	public Area verRol(@PathVariable Long id) {
		return repo.findById(id);
	}

	@PostMapping("/crear")
	public Area crear(@RequestBody Area entidad) {
		return repo.save(entidad);
	}

	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Area editar(@RequestBody Area entidad, @PathVariable Long id) {
		Area entidadDb = repo.findById(id);
		entidadDb = entidad;
		entidadDb.setIdArea(entidad.getIdArea());

		return repo.save(entidadDb);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Long id) {
		repo.delete(id);
	}

	@PostMapping("/findAreasByRoles")
	@ResponseStatus(HttpStatus.CREATED)
	public List<Area> findAreasByRoles(@RequestBody Collection<Long> expresion) {
		return repo.findAreasByRoles(expresion);
	}
}
