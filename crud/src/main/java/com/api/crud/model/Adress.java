package com.api.crud.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "adresses")
@Entity(name = "adresses")
public class Adress {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int 	id;
	
	@JsonManagedReference
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "person")
	private Person	person;
	
	private String	adress;
	private String	cep;
	private String	city;
	private int		houseNumber;
	private boolean mainAdress;
	
	public Adress() {
		
	}
	
	public Adress(Person person, String adress, String cep, String city, int houseNumber, boolean mainAdress) {
		super();
		this.person = person;
		this.adress = adress;
		this.cep = cep;
		this.city = city;
		this.houseNumber = houseNumber;
		this.mainAdress = mainAdress;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public boolean isMainAdress() {
		return mainAdress;
	}

	public void setMainAdress(boolean mainAdress) {
		this.mainAdress = mainAdress;
	}
}
