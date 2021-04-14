package com.aeg.encuestas.servicio;

import java.util.List;

import com.aeg.encuestas.modelo.Encuesta;

public interface IEncuestaServicio {
	public List <Encuesta> findAll();
	public Encuesta findById(Long Id);
	public void salvar(Encuesta encuesta);
	public void modificar(Encuesta encuesta);
	public void borrar(Long id);

}

