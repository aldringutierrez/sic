package com.aeg.marcas.control;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aeg.marcas.modelo.Marca;
import com.aeg.marcas.servicio.IMarcaServicio;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MarcaControl {
	@Autowired
	private IMarcaServicio marcaService;
	
	@GetMapping("/listar") 
	public List<Marca> listar(){
		return marcaService.findAll();
	}
	
	@GetMapping("/ver/{id}") 
	public Marca detalle(@PathVariable Long id) {
		return marcaService.findById(id);
		
	}
	
	@PostMapping("/nuevo") 
	public void insertar(@RequestBody Marca marca) {
		marcaService.salvar(marca);
	}
	
	@PutMapping("/modificar") 
	public void modificar(@RequestBody Marca marca) {
		marcaService.salvar(marca);
	}
	
	@DeleteMapping("/borrar/{id}") 
	public void borrar(@PathVariable Long id) {
		marcaService.borrar(id);
	}
	


	
	
}
