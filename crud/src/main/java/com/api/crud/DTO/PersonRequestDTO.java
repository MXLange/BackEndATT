package com.api.crud.DTO;

import java.sql.Date;

import com.api.crud.model.Adress;

public record PersonRequestDTO(String name, Date dateOfBirth, Adress adress) {

}
