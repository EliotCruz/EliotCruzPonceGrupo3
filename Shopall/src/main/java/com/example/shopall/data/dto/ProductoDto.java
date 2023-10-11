package com.example.shopall.data.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductoDto {

    private Integer id;
    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer inventario;
    private Integer idcategoria;

    public ProductoDto(Integer id, String nombre, String descripcion, Double precio, Integer inventario, Integer idcategoria){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.inventario = inventario;
        this.idcategoria = idcategoria;
    }
}
