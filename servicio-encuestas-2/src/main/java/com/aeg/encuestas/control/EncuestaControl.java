package com.aeg.encuestas.control;

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

import com.aeg.encuestas.modelo.Encuesta;
import com.aeg.encuestas.servicio.IEncuestaServicio;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EncuestaControl {
	@Autowired
	private IEncuestaServicio encuestaService;
	
	@GetMapping("/listar") 
	public List<Encuesta> listar(){
		return encuestaService.findAll();
	}
	
	@GetMapping("/ver/{id}") 
	public Encuesta detalle(@PathVariable Long id) {
		return encuestaService.findById(id);
		
	}
	
	@PostMapping("/nuevo") 
	public void insertar(@RequestBody Encuesta encuesta) {
		Calendar cal = Calendar.getInstance();
		// remove next line if you're always using the current time.
		cal.setTime(new Date());
		cal.add(Calendar.HOUR, -5);
		Date oneHourBack = cal.getTime();
		System.out.println("EncuestaController.nombre oneHourBack : "+oneHourBack);
		encuesta.setFechaRespuesta(oneHourBack);
		encuestaService.salvar(encuesta);
	}
	
	@PutMapping("/modificar") 
	public void modificar(@RequestBody Encuesta encuesta) {
		System.out.println("EncuestaController.modificar nombre : "+encuesta.getComentarios());
		encuestaService.salvar(encuesta);
	}
	
	@DeleteMapping("/borrar/{id}") 
	public void borrar(@PathVariable Long id) {
		encuestaService.borrar(id);
	}
	


	
	
}
