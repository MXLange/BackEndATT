package com.api.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.crud.DTO.AdressRequestDTO;
import com.api.crud.DTO.PersonRequestDTO;
import com.api.crud.model.Adress;
import com.api.crud.model.Person;
import com.api.crud.services.AdressService;
import com.api.crud.services.PersonService;

@RestController
@RequestMapping("/")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@Autowired
	private AdressService adressService;
	
	
	@PostMapping(path = "/new-person") //path must be defined
	public void createPerson(@RequestBody PersonRequestDTO person) {
		personService.create(person);
	}
	
	@PostMapping(path = "/new-adress/{id}") //path must be defined
	public void createAdress(@RequestBody AdressRequestDTO adress, @PathVariable Integer id) {
		adressService.create(adress, id);
	}
	
	@PutMapping(path = "/update") //path must be defined
	public void updatePerson(@RequestBody PersonRequestDTO person) {
		personService.update(person);
	}
	
	@GetMapping(path = "/person/{id}")
	@ResponseBody
	public ResponseEntity<Person> consultPerson(@PathVariable int id) {
		Person person = personService.getPerson(id);
		return new ResponseEntity<Person>(person, HttpStatus.OK);
	}
	
	@GetMapping(path = "/list-all")
	@ResponseBody
	public ResponseEntity<List<Person>> consultPeople() {
		
		List<Person> people = personService.getAllPeople();
		return new ResponseEntity<List<Person>>(people, HttpStatus.OK);
	}
	
	@GetMapping(path = "/adress/{id}")
	@ResponseBody
	public ResponseEntity<List<Adress>> consultAdress(@PathVariable int id ) {
		List<Adress> adresses = adressService.getPersonAdress(id);
		return new ResponseEntity<List<Adress>>(adresses, HttpStatus.OK);
	}
	
	
}
