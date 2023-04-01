package com.api.crud.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "persons")
@Entity(name = "persons")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int				id;
	
	@JsonManagedReference
	@JsonIgnore
	@OneToMany(mappedBy = "person")
	private List<Adress>	adress;;
	
	private String			name;
	private LocalDate		DateOfBirth;
	
	
	
	public Person() {
		
	}
	
	public Person(String name, String dateOfBirth) {
		
		// dateOdBirth must be -> "dd/MM/yyyy"
		
		this.name = name;
		
		String[] separateDate = dateOfBirth.split("/");
		
		LocalDate date = LocalDate.of(Integer.parseInt(separateDate[2]),
				Integer.parseInt(separateDate[1]), Integer.parseInt(separateDate[0]));
		
		this.DateOfBirth = date;
	}
	
	
	public Person(String name, String dateOfBirth, Adress adress) {
		
		// dateOdBirth must be -> "dd/MM/yyyy"
		
		this.adress.add(adress);
		this.name = name;
		
		String[] separateDate = dateOfBirth.split("/");
		
		LocalDate date = LocalDate.of(Integer.parseInt(separateDate[2]),
				Integer.parseInt(separateDate[1]), Integer.parseInt(separateDate[0]));
		
		this.DateOfBirth = date;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth) {

		String[] separateDate = dateOfBirth.split("/");
		
		LocalDate date = LocalDate.of(Integer.parseInt(separateDate[2]),
				Integer.parseInt(separateDate[1]), Integer.parseInt(separateDate[0]));
		
		this.DateOfBirth = date;
	}
	
	public List<Adress> getAdress() {
		return adress;
	}
	
	public void setAdress(Adress adress) {
		this.adress.add(adress);
	}
	
	
	
}
