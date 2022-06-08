package com.idat.evaluacionContinua.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.evaluacionContinua.model.Universidad;
import com.idat.evaluacionContinua.service.UniversidadService;

@Controller
@RequestMapping("/universidad/v1")
public class UniversidadController {
	
	@Autowired
	private UniversidadService service;
	
	@RequestMapping("/listar")
	public @ResponseBody List<Universidad> listar(){
		return service.listarUniversidad();
	}

}
