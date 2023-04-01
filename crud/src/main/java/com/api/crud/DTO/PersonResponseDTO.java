package com.api.crud.DTO;

import java.util.List;

import com.api.crud.model.Adress;

public record PersonResponseDTO(Integer id, List<Adress> adress, String name, String date ) {

}
