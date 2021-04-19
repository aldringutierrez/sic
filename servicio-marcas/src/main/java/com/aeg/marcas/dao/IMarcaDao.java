package com.aeg.marcas.dao;

import org.springframework.data.repository.CrudRepository;

import com.aeg.marcas.modelo.Marca;

public interface IMarcaDao  extends CrudRepository<Marca, Long> {

}
