package com.aeg.marcas.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.aeg.marcas.dao.IMarcaDao;
import com.aeg.marcas.modelo.Marca;

@Service
public class MarcaServicio implements IMarcaServicio{

	@Autowired
	private IMarcaDao marcaDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Marca> findAll() {
		System.out.println("***aeg*** marcaServiceImpl.findAll");
		return (List<Marca>) marcaDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Marca findById(Long id) {
		return marcaDao.findById(id).orElse(null);
	}

	@Override
	public void salvar(Marca marca) {
		marcaDao.save(marca);
	}

	@Override
	public void modificar(Marca marca) {
//		System.out.println("marcaServiceImpl.modificar nombre : "+marca.getComentarios());
		marcaDao.save(marca);
	}

	@Override
	public void borrar(Long id) {
		marcaDao.deleteById(id);
	}
	
}

