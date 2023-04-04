package com.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Mi clase Producto se convierte en una entidad JPA (persistencia de datos)
	@Entity
	
	//Especificar de forma correcta el nombre de la tabla
	@Table(name="Producto")
	
public class Producto {
		
	@Id //Es la primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)//El campo de id sera generado autamticmanet epor la DB
	@Column(name="id", unique=true, nullable=false)
	
	//Atributos
	private Long id;
	private String nombre;
	private String descripcion;
	private String uRLImagen;
	private Double precio;
	
	
	
	//Constructor vacio para el Jackson(serializar
	//y deserealizar un objeto de Java a JACKSON)
	public Producto() {
		
	}
	
	//Constructor con todos los atributos
	public Producto(Long id, String nombre, String descripcion, String uRLImagen, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.uRLImagen = uRLImagen;
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getuRLImagen() {
		return uRLImagen;
	}

	public void setuRLImagen(String uRLImagen) {
		this.uRLImagen = uRLImagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//toString (sobreescritura de metodos)
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", uRLImagen=" + uRLImagen
				+ ", precio=" + precio + "]";
	}
	
	
	

}
