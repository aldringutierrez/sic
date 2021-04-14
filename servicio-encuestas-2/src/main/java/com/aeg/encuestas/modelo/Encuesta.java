package com.aeg.encuestas.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "encuestas")
public class Encuesta implements Serializable {
	private static final long serialVersionUID = 8162532782304710760L;
	@Id
	@Column(name = "id_encuesta")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idEncuesta;
	Integer documento;
	String email;
	String comentarios;
	Integer marcaFavorita;
	@Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	Date fechaRespuesta;
	public Long getIdEncuesta() {
		return idEncuesta;
	}
	public void setIdEncuesta(Long idEncuesta) {
		this.idEncuesta = idEncuesta;
	}
	public Integer getDocumento() {
		return documento;
	}
	public void setDocumento(Integer documento) {
		this.documento = documento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public Integer getMarcaFavorita() {
		return marcaFavorita;
	}
	public void setMarcaFavorita(Integer marcaFavorita) {
		this.marcaFavorita = marcaFavorita;
	}
	public Date getFechaRespuesta() {
		return fechaRespuesta;
	}
	public void setFechaRespuesta(Date fechaRespuesta) {
		this.fechaRespuesta = fechaRespuesta;
	}

}
