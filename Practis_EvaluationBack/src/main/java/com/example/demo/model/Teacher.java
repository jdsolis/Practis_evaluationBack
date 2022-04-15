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

@Entity (name = "Teacher")
@Table(name = "teacher")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "idteacher")
	/** Tabla profesor*/
	private Long idteacher;

	@Column(name = "nombre_profesor", nullable = false)
	/** Tabla profesor*/
	private String name;
	
	@Column(name = "apellidos_profesor", nullable = false)
	/** Tabla profesor*/
	private String lasName;
	
	@Column(name = "Correo_profesor", nullable = false)
	/** Tabla profesor*/
	private String mail;
	
	@Column(name = "Contraseña_profesor", nullable = false)
	/** Tabla profesor*/
	private String pass;
	
	@Column(name = "edad_profesor", nullable = false)
	/** Tabla profesor*/
	private String age;
	
	@Column(name = "Celular_profesor", nullable = false)
	/** Tabla profesor*/
	private String phone;
	
	@Column(name = "Colegio_profesor", nullable = false)
	/** Tabla profesor*/
	private String college;

	public Teacher() {
		
	}
	
	
	
	
	

	public Teacher(Long idteacher, String name, String lasName, String mail, String pass, String age, String phone,
			String college) {
		super();
		this.idteacher = idteacher;
		this.name = name;
		this.lasName = lasName;
		this.mail = mail;
		this.pass = pass;
		this.age = age;
		this.phone = phone;
		this.college = college;
	}






	public Long getIdteacher() {
		return idteacher;
	}

	public void setIdteacher(Long idteacher) {
		this.idteacher = idteacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLasName() {
		return lasName;
	}

	public void setLasName(String lasName) {
		this.lasName = lasName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	
	
}
