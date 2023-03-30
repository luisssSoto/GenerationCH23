package com.generation.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.repositories.ProductoRepository;

//Decimos que es un Servicio
@Service
public class ProductoService {
	
	//Create el objeto de la clase ProductoRepository
	private final ProductoRepository productoRepository;
	
	//Cablear con el Autowired
	@Autowired
	
	//Uso ese objeto como parametro de mi constructor
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository=productoRepository;
	}
	
	
	//Create (Metodo para agregar un objeto del tipo Producto y guardarlo en la base de datos)
	public void crearProducto() {
		
	}
	
	//Read (leer una lista de productos)
	public List<Producto> leerProductos() {
		return productoRepository.findAll();
		//toda la lista de productos
	}
	
	//Read (leer un producto con un id especifico)
	public Producto leerProducto(Long proId) {
		return productoRepository.findById(proId).orElseThrow(()-> new IllegalStateException("El producto" + " con el Id " + proId +" no existe") );
	}
	
	//Update
	public void actualizarProducto() {
		
	}
	
	//Delete
	public void borrarProducto() {
		
	}
}
