package com.example.shopall.data.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

@Getter
@Setter
public class PerfilDto implements Serializable{
    private Integer id;
    private String nombre;
    private String apellidos;
    private String rfc;
    private String domicilio;
    private String telefono;
    private Integer tipo;

    public PerfilDto(Integer id, String nombre, String apellidos, String rfc, String domicilio, String telefono, Integer tipo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.rfc = rfc;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.tipo = tipo;
    }

}
