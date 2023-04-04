package com.generation.ecommerce.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generation.ecommerce.model.ProductoCarritoModel;
/*Indicamos que extendemos de la interfaz JpaRepository, y que manejamos la entidad llamada ProductoCarrito identificandola
por su atributo Long id*/

//Usare "querys" predefinidad del JPA Repository
public interface ProductoCarritoRepository extends JpaRepository<ProductoCarritoModel, Long>{
	
	
	/*Esta anotacion nos indica que podemos realizar una consulta personalizada a la db. En este caso,
	 * obtenemos un producto por su nombre. Dicha consulta esta escrita en JPQL (Java Persistance Query Language)
	 * que es un lenguaje orientado a objetos que permite realizar consultas a bases de datos relacionales.
	 */
	
	//Crear mis propias querys personalizadas
	@Query("SELECT p FROM Producto p WHERE p.nombre=?1")
	
	/*Metodo que realiza la consulta personalizada definida anteriormente. Retorna un Optional que puede contender un 
	objeto Producto si se encuentra en la DB con el nombre especificado, o un Optional vacio si no existe.*/
	Optional<ProductoCarritoModel> findByNombre(String nombre);
	
}
