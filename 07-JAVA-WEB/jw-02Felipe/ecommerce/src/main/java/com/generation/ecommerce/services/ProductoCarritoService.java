//package com.generation.ecommerce.services;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.generation.ecommerce.model.ProductoCarritoModel;
//import com.generation.ecommerce.repositories.ProductoCarritoRepository;
//
////Decimos que es un Servicio
//@Service
//public class ProductoCarritoService {
//
//	// Create el objeto de la clase ProductoRepository
//	private final ProductoCarritoRepository productoCarritoRepository;
//
//	// Cablear con el Autowired
//	@Autowired
//
//	// Uso ese objeto como parametro de mi constructor
//	public ProductoCarritoService(ProductoCarritoRepository productoCarritoRepository) {
//		this.productoCarritoRepository = productoCarritoRepository;
//	}
//
//	// Create (Metodo para agregar un objeto del tipo Producto y guardarlo en la
//	// base de datos)
//	// Si el producto existe
//	public void crearProducto(ProductoCarritoModel productoCarritoModel) {
//		Optional<ProductoCarritoModel> productoByName = // variable temporal
//				productoCarritoRepository.findByNombre(productoCarritoModel.getNombre());
//		if (productoByName.isPresent()) {
//			throw new IllegalStateException("El producto: [" + productoCarritoModel.getNombre() + "] ya existe");
//		} else {
//			productoCarritoRepository.save(productoCarritoModel);
//		}
//	}
//
//	// Read (leer una lista de productos)
//	public List<ProductoCarritoModel> leerProductos() {
//		return productoCarritoRepository.findAll();
//		// toda la lista de productos
//	}
//
//	// Read (leer un producto con un id especifico)
//	public ProductoCarritoModel leerProducto(Long productoCarritoId) {
//		return productoCarritoRepository.findById(productoCarritoId)
//				.orElseThrow(() -> new IllegalStateException("El producto" + " con el Id " + productoCarritoId + " no existe"));
//	}
//
//	//Update para actualizar un producto
//    public void actualizarProducto(Long prodId, String nombre, String descripcion, String uRLImagen, double precio) {
//        
//        //si el producto existe...
//        if(productoCarritoRepository.existsById(prodId)) {
//            //entonces lo modifico
//            ProductoCarritoModel productoABuscar = productoCarritoRepository.getById(prodId) ;//ya que verifico que mi producto existe, lo traigo y lo asigno a una variable llamada productoABuscar
//            if (nombre!= null) productoABuscar.setNombre(nombre);
//            if (descripcion != null) productoABuscar.setDescripcion(descripcion);
//            if (precio != 0) productoABuscar.setPrecio(precio);
//            if (uRLImagen != null) productoABuscar.setuRLImagen(uRLImagen);
//            //cuando termino de editar el objeto...
//            productoCarritoRepository.save(productoABuscar);
//        }else {
//            System.out.println("El producto con el id " + prodId + " no existe");
//        }        
//    }
//
//	// Delete
//	public void borrarProducto(Long proId) {
//		if(productoCarritoRepository.existsById(proId)) {
//			productoCarritoRepository.deleteById(proId);
//		}
//
//	}
//}
