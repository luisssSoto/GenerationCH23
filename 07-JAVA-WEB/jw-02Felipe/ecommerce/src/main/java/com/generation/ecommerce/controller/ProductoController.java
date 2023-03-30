package com.generation.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; //Enlace para establecer conexion a ProductoService
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.services.ProductoService;

//Controller para soportar metodos http
@RestController


//Indica la ruta o URL de nuestro endpoint para saber donde se manejan esas solicitudes HTTP
@RequestMapping(path="/miOtzo/productos/")

public class ProductoController {
	//Inyeccion de dependencias
	/*Declara la instancia de la clase ProductoRepository que se utiliza para acceder a los metodos definidos ahi.
	 * Se declara como final porque su valor no sera cambiado despues de inicializar, para que esta instancia no 
	 * cambie durante la ejecucion del programa
	 */
	
	//Instancia de la clase "ProductoService"
	private final ProductoService productoServicio;//No nos llames nosotros te llamamos
	
	//instancia comun
	//Perrito perrito1 = new Perrito('Chase', 'Police', 5);
	
	@Autowired 
	/*Se usa para indicar a Spring que inyecte automaticamente una instancia del ProductoService en la
	clase ProductoController. Asi nos aseguramos que la instancia esta disponible y lista par ausarse cuando se 
	necesite en la clase*/
	
	//Segundo parte de inyeccion de dependencia
	//Constructor con ese objeto como parametro
	public ProductoController(ProductoService productoServicio) {
		this.productoServicio = productoServicio;
		
	}
	
	//HHTP Get para todos los productos
	@GetMapping
	public List<Producto> getProducto() {
		return productoServicio.leerProductos();
		
	}
	
	//HTTP Post
	@PostMapping
	public List<Producto> postProducto() {
		return productoServicio.crearProducto();
	}
	
	//HHTP Put
	@PutMapping
	public List<Producto> putProducto() {
		return productoServicio.actualizarProducto();
	}
	
	//HTTP Delete
	@DeleteMapping
	public List<Producto> deleteProducto() {
		return productoServicio.borrarProducto();
	}
}
