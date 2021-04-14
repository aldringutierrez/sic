package com.aeg.encuestas.dao;

import org.springframework.data.repository.CrudRepository;

import com.aeg.encuestas.modelo.Encuesta;

public interface IEncuestaDao  extends CrudRepository<Encuesta, Long> {

}
