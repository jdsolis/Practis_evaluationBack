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

@Entity (name = "Student")
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "idteacher")
	/** Tabla student*/
	private Long idstudent;
	
	@Column(name = "nombre_estudiante", nullable = false)
	private String nameStudent;
	
	@Column(name = "apellido_estudiante", nullable = false)
	private String lastNameStudent;
	
	@Column(name = "documento", nullable = false)
	private String document;
	
	@Column(name = "fecha_nacimineto", nullable = false)
	private String birthDateStu;
	
	@Column(name = "alergias", nullable = false)
	private String allergies;
	
	@Column(name = "correo", nullable = false)
	private String email;
	
	@Column(name = "contrasena", nullable = false)
	private String pass;
	
	@Column(name = "grado", nullable = false)
	private String gradeStudent;
	
	@Column(name = "nombre_acudiente", nullable = false)
	private String nameacudiente;
	
	@Column(name = "apellido_acudiente", nullable = false)
	private String lastNmaAcudinte;
	
	@Column(name = "telefono_acudiente", nullable = false)
	private String PhoneAcudiente;

	public Student() {
		
	}

	public Long getIdstudent() {
		return idstudent;
	}

	public void setIdstudent(Long idstudent) {
		this.idstudent = idstudent;
	}

	public String getNameStudent() {
		return nameStudent;
	}

	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}

	public String getLastNameStudent() {
		return lastNameStudent;
	}

	public void setLastNameStudent(String lastNameStudent) {
		this.lastNameStudent = lastNameStudent;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getBirthDateStu() {
		return birthDateStu;
	}

	public void setBirthDateStu(String birthDateStu) {
		this.birthDateStu = birthDateStu;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGradeStudent() {
		return gradeStudent;
	}

	public void setGradeStudent(String gradeStudent) {
		this.gradeStudent = gradeStudent;
	}

	public String getNameacudiente() {
		return nameacudiente;
	}

	public void setNameacudiente(String nameacudiente) {
		this.nameacudiente = nameacudiente;
	}

	public String getLastNmaAcudinte() {
		return lastNmaAcudinte;
	}

	public void setLastNmaAcudinte(String lastNmaAcudinte) {
		this.lastNmaAcudinte = lastNmaAcudinte;
	}

	public String getPhoneAcudiente() {
		return PhoneAcudiente;
	}

	public void setPhoneAcudiente(String phoneAcudiente) {
		PhoneAcudiente = phoneAcudiente;
	}
	
	
	
}
