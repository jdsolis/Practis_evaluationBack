package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity (name = "Rubrics")
@Table(name = "rubrics")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rubrics {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "idRubrics")
	/** Tabla Rubricas*/
	private Long idRubrics;
	
	@Column(name = "desciptions_Rrics", nullable = false)
	private String desciptionsRrics;
	
	@Column(name = "estasdo_Rbric", nullable = false)
	private String estasdoRbric;

	public Rubrics() {
	
	}

	public Long getIdRubrics() {
		return idRubrics;
	}

	public void setIdRubrics(Long idRubrics) {
		this.idRubrics = idRubrics;
	}

	public String getDesciptionsRrics() {
		return desciptionsRrics;
	}

	public void setDesciptionsRrics(String desciptionsRrics) {
		this.desciptionsRrics = desciptionsRrics;
	}

	public String getEstasdoRbric() {
		return estasdoRbric;
	}

	public void setEstasdoRbric(String estasdoRbric) {
		this.estasdoRbric = estasdoRbric;
	}
	
		
}
