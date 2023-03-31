package com.api.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.crud.model.Person;

public interface Personrepository extends JpaRepository<Person, Integer> {

}
