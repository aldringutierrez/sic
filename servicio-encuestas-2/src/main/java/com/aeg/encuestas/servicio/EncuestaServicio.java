package com.aeg.encuestas.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.aeg.encuestas.dao.IEncuestaDao;
import com.aeg.encuestas.modelo.Encuesta;

@Service
public class EncuestaServicio implements IEncuestaServicio{

	@Autowired
	private IEncuestaDao EncuestaDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Encuesta> findAll() {
		System.out.println("***aeg*** EncuestaServiceImpl.findAll");
		return (List<Encuesta>) EncuestaDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Encuesta findById(Long id) {
		return EncuestaDao.findById(id).orElse(null);
	}

	@Override
	public void salvar(Encuesta encuesta) {
		EncuestaDao.save(encuesta);
	}

	@Override
	public void modificar(Encuesta encuesta) {
		System.out.println("EncuestaServiceImpl.modificar nombre : "+encuesta.getComentarios());
		EncuestaDao.save(encuesta);
	}

	@Override
	public void borrar(Long id) {
		EncuestaDao.deleteById(id);
	}
	
}

