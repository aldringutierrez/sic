package com.aeg.marcas.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "marcas")
public class Marca implements Serializable {
	private static final long serialVersionUID = 8162532782304710760L;
	@Id
	@Column(name = "id_marca")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idmarca;
	String nombre;
	public Long getIdmarca() {
		return idmarca;
	}
	public void setIdmarca(Long idmarca) {
		this.idmarca = idmarca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	}
