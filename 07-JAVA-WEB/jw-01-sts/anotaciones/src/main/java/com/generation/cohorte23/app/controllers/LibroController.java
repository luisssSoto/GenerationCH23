package com.generation.cohorte23.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.generation.cohorte23.app.repositories.LibroRepositorios;
import com.generation.cohorte23.app.model.Libro;

@RestController
public class LibroController {
	@Autowired
	LibroRepositorios libroRepo;

	@RequestMapping("/libros")
	public List<Libro> listarTodo() {
		return libroRepo.listar();
	}

}
