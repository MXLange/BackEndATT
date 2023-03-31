package com.api.crud.DTO;

import com.api.crud.model.Person;

public record AdressRequestDTO(Person person, String adress, String cep, String city, int houseNumber, boolean mainAdress) {

}
