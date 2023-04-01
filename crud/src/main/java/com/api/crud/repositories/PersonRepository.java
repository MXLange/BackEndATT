package com.api.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.crud.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

	public Person findByName(String name);

}
