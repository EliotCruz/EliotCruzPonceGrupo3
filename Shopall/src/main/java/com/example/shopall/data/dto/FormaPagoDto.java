package com.example.shopall.data.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormaPagoDto {

    private int idFormaPago;
    private String nombre;
    private String descripcion;

    public FormaPagoDto(int idFormaPago, String nombre, String descripcion){
        this.idFormaPago = idFormaPago;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
