package com.api.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.crud.DTO.AdressRequestDTO;
import com.api.crud.model.Adress;
import com.api.crud.model.Person;
import com.api.crud.repositories.AdressRepository;
import com.api.crud.repositories.PersonRepository;

@Service
public class AdressService {
	
	@Autowired
	private PersonRepository personRepo;
	
	@Autowired
	private AdressRepository adressRepo;

	public void create(AdressRequestDTO adress, Integer id) {
		Adress newAdress = new Adress();
		newAdress.setAdress(adress.adress());
		newAdress.setCep(adress.cep());
		newAdress.setCity(adress.city());
		newAdress.setHouseNumber(adress.houseNumber());
		newAdress.setMainAdress(adress.mainAdress());
		Person findPerson = personRepo.getReferenceById(id);
		newAdress.setPerson(findPerson);
		adressRepo.save(newAdress);
	}

	public List<Adress> getPersonAdress(int id) {
		List<Adress> adresses = adressRepo.findAll();
		adresses.stream().filter(ad -> ad.getPerson().getId() == id);
		return adresses;
	}
	
}
