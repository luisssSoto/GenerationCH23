package com.generation.cohorte23.jpa.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "producto")
public class ProductoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String nombre_producto;
	
	@ManyToOne
	private UsuarioModel usuario;
	
	@OneToOne(mappedBy = "producto")
    private DetalleOrdenModel detalle;

	public DetalleOrdenModel getDetalle() {
		return detalle;
	}

	public void setDetalle(DetalleOrdenModel detalle) {
		this.detalle = detalle;
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	public ProductoModel() {
		super();
	}
	
	public ProductoModel(Long id, String nombre_producto, Integer usuario_id) {
		super();
		this.id = id;
		this.nombre_producto = nombre_producto;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	
}