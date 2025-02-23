package com.jacaranda.entity;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

@Entity
public class Customer implements Comparable<Customer>,Serializable {
	//Variables
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	private String name;
	
	private String surnames;
	
	@NonNull
	@DateTimeFormat(pattern = "ddMMyyyy")
	private LocalDate birthDate;
	
	
	private String dni;
	
	// Relaciones con la entidad Visual
	@OneToMany(mappedBy="customer")
	private List<Visual> visualizaciones;
	
	
	//Constructores
	public Customer() {
		super();
		visualizaciones = new ArrayList<Visual>();
	}


	public Customer(String name, String surnames, LocalDate birthDate, String dni) {
		super();
		this.name = name;
		this.surnames = surnames;
		this.birthDate = birthDate;
		this.dni = dni;
		visualizaciones = new ArrayList<Visual>();
	}

//GET y SET
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurnames() {
		return surnames;
	}

	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getDni() {
		return dni;
	}

	public List<Visual> getVisualizaciones() {
		return visualizaciones;
	}
	
	//ComparaTo
	@Override
	public int compareTo(Customer other) {
	
		return Long.valueOf(getId()).compareTo(getId());
	}
	
}
