package com.api.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.crud.DTO.PersonRequestDTO;
import com.api.crud.model.Person;
import com.api.crud.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepo;
	
	public void create(PersonRequestDTO person) {
		Person newPerson = new Person();
		newPerson.setName(person.name());
		newPerson.setDateOfBirth(person.dateOfBirth());
		personRepo.save(newPerson);
	}
	
	public void update(PersonRequestDTO person) {
		Person foundPerson = personRepo.getReferenceById(person.id());
		foundPerson.setName(person.name());
		foundPerson.setDateOfBirth(person.dateOfBirth());
		personRepo.save(foundPerson);
	}
	
	public Person getPerson(int id) {
		Person person = personRepo.getReferenceById(id);
		return person;
	}
	
	public List<Person> getAllPeople() {
		return personRepo.findAll();
	}
	
}
