package com.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Mi clase ProductoCarrito se convierte en una entidad JPA (persistencia de datos)
@Entity
	
//Especificar de forma correcta el nombre de la tabla
//	@Table(name="Producto")

public class ProductoCarritoModel {
	@Id //Es la primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)//El campo de id sera generado automaticamente por la DB
	@Column(name="id", unique=true, nullable=false)
	
	//Atributos
	private Long id;
	private Long producto_id;
	private Long carrito_id;
	private int cantidad;
	
	//Constructor vacio para el Jackson(serializar
	//y deserealizar un objeto de Java a JACKSON)
	
	public ProductoCarritoModel() {
			
		}
	
	//Constructor con todos los atributos
	public ProductoCarritoModel(Long id, Long producto_id, Long carrito_id, int cantidad) {
		super();
		this.id = id;
		this.producto_id = producto_id;
		this.carrito_id = carrito_id;
		this.cantidad = cantidad;
	}

	//Metodos Gets and Sets 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProducto_id() {
		return producto_id;
	}

	public void setProducto_id(Long producto_id) {
		this.producto_id = producto_id;
	}

	public Long getCarrito_id() {
		return carrito_id;
	}

	public void setCarrito_id(Long carrito_id) {
		this.carrito_id = carrito_id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	//Metodo toSting
	@Override
	public String toString() {
		return "ProductoCarritoModel [id=" + id + ", producto_id=" + producto_id + ", carrito_id=" + carrito_id
				+ ", cantidad=" + cantidad + "]";
	}
	
	
	
	
	
	
	
	
	

}
