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

@Entity (name = "Bda")
@Table(name = "bda")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Dba {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "idDba")
	/** Tabla DBA*/
	private Long idDba;

	@Column(name = "descriptionDba", nullable = false)
	/** Tabla DBA*/
	private String descriptionDba;
	
	@Column(name = "estado_Dba", nullable = false)
	/** Tabla DBA*/
	private String estadoDba;
	
}
