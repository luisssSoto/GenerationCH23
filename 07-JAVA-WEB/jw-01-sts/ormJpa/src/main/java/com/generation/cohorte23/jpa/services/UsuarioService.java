package com.generation.cohorte23.jpa.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.cohorte23.jpa.models.UsuarioModel;
import com.generation.cohorte23.jpa.repositories.UsuarioRepositorio;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepositorio usuarioRepositorio1;
	public ArrayList<UsuarioModel> busquedaPorPrioridad(Integer prioridad){
		return usuarioRepositorio1.busquedaPorPrioridad(prioridad);
	}
	public ArrayList<UsuarioModel> listarUsuarios(){
		return (ArrayList<UsuarioModel>) usuarioRepositorio1.findAll();
	}
}
