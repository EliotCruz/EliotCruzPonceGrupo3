package com.example.shopall.data.dto;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CategoriaDto {
    Integer id;
    String Nombre;
    String Descripcion;

    public CategoriaDto(Integer id, String Nombre, String Descripcion){
        this.id = id;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }
}
