package com.generation.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.repositories.ProductoRepository;

//Decimos que es un Servicio
@Service
public class ProductoService {

	// Create el objeto de la clase ProductoRepository
	private final ProductoRepository productoRepository;

	// Cablear con el Autowired
	@Autowired

	// Uso ese objeto como parametro de mi constructor
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}

	// Create (Metodo para agregar un objeto del tipo Producto y guardarlo en la
	// base de datos)
	// Si el producto existe
	public void crearProducto(Producto producto) {
		Optional<Producto> productoByName = // variable temporal
				productoRepository.findByNombre(producto.getNombre());
		if (productoByName.isPresent()) {
			throw new IllegalStateException("El producto: " + "[" + producto.getNombre() + "] ya existe");
		} else {
			productoRepository.save(producto);
		}
	}

	// Read (leer una lista de productos)
	public List<Producto> leerProductos() {
		return productoRepository.findAll();
		// toda la lista de productos
	}

	// Read (leer un producto con un id especifico)
	public Producto leerProducto(Long prodId) {
		return productoRepository.findById(prodId)
				.orElseThrow(() -> new IllegalStateException("El producto" + " con el Id " + prodId + " no existe"));
	}

	//Update para actualizar un producto
    public void actualizarProducto(Long prodId, String nombre, String descripcion, String uRLImagen, double precio) {
        
        //si el producto existe...
        if(productoRepository.existsById(prodId)) {
            //entonces lo modifico
            Producto productoABuscar = productoRepository.getById(prodId) ;//ya que verifico que mi producto existe, lo traigo y lo asigno a una variable llamada productoABuscar
            if (nombre!= null) productoABuscar.setNombre(nombre);
            if (descripcion != null) productoABuscar.setDescripcion(descripcion);
            if (precio != 0) productoABuscar.setPrecio(precio);
            if (uRLImagen != null) productoABuscar.setuRLImagen(uRLImagen);
            //cuando termino de editar el objeto...
            productoRepository.save(productoABuscar);
        }else {
            System.out.println("El producto con el id " + prodId + " no existe");
        }        
    }

	// Delete
	public void borrarProducto(Long proId) {
		if(productoRepository.existsById(proId)) {
			productoRepository.deleteById(proId);
		}

	}
}
