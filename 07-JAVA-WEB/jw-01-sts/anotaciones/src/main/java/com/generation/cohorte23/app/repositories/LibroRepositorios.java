package com.generation.cohorte23.app.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.generation.cohorte23.app.model.Libro;

@Repository
public class LibroRepositorios {
	public List<Libro> listar(){
		List<Libro> lista = new ArrayList<Libro>();
		lista.add(new Libro("Spring Boot", "LUis", "1"));
		lista.add(new Libro("Java", "Pedro", "2"));
		lista.add(new Libro("C", "Richard", "3"));
		return lista;
	}

}
