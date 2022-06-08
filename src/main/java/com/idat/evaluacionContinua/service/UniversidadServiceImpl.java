package com.idat.evaluacionContinua.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.evaluacionContinua.Repository.UniversidadRepository;
import com.idat.evaluacionContinua.model.Universidad;


@Service
public class UniversidadServiceImpl implements UniversidadService {
	
	@Autowired
	private UniversidadRepository repository;

	@Override
	public void guardarUniversidad(Universidad universidad) {
		// TODO Auto-generated method stub
		repository.guardarUniversidad(universidad);

	}

	@Override
	public void actualizarUniversidad(Universidad universidad) {
		// TODO Auto-generated method stub
		repository.actualizarUniversidad(universidad);

	}

	@Override
	public void eliminarUniversidad(Integer id) {
		// TODO Auto-generated method stub
		repository.eliminarUniversidad(id);

	}

	@Override
	public List<Universidad> listarUniversidad() {
		// TODO Auto-generated method stub
		return repository.listarUniversidad();
	}

	@Override
	public Universidad obtenerUniversidadId(Integer id) {
		// TODO Auto-generated method stub
		return repository.obtenerUniversidadId(id);
	}

}
