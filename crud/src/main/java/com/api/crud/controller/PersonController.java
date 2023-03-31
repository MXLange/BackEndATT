package com.api.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.crud.repositories.AdressRepository;
import com.api.crud.repositories.Personrepository;

@RestController
@RequestMapping("/")
public class PersonController {

	@Autowired
	private Personrepository personRepo;
	@Autowired
	private AdressRepository adressRepo;
	
	@PostMapping(path = "newPerson")
	public void createNewPerson(String name, ) {
		
	}
	
}
