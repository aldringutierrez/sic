package com.aeg.marcas.servicio;

import java.util.List;

import com.aeg.marcas.modelo.Marca;

public interface IMarcaServicio {
	public List <Marca> findAll();
	public Marca findById(Long Id);
	public void salvar(Marca marca);
	public void modificar(Marca marca);
	public void borrar(Long id);

}

