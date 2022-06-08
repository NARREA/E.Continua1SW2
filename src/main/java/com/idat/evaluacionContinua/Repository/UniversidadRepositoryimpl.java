package com.idat.evaluacionContinua.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.evaluacionContinua.model.Universidad;


@Repository
public class UniversidadRepositoryimpl implements UniversidadRepository {
	
	public List<Universidad> listar = new ArrayList<Universidad>();

	@Override
	public void guardarUniversidad(Universidad universidad) {
		// TODO Auto-generated method stub
		listar.add(universidad);
		
	}

	@Override
	public void actualizarUniversidad(Universidad universidad) {
		// TODO Auto-generated method stub
		Universidad u = obtenerUniversidadId(universidad.getIdUniversidad());
		listar.remove(u);
		listar.add(universidad);
		
	}

	@Override
	public void eliminarUniversidad(Integer id) {
		// TODO Auto-generated method stub
		
		Universidad u = obtenerUniversidadId(id);
		listar.remove(u);
		
	}

	@Override
	public List<Universidad> listarUniversidad() {
		// TODO Auto-generated method stub
		return listar;
	}

	@Override
	public Universidad obtenerUniversidadId(Integer id) {
		// TODO Auto-generated method stub
		
		return listar.stream().filter(u -> u.getIdUniversidad()==id).findFirst().orElse(null);
		
	}
	
	

	

}
