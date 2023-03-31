package com.api.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.crud.model.Adress;
import com.api.crud.model.Person;

public interface AdressRepository extends JpaRepository<Adress, Person> {

}
