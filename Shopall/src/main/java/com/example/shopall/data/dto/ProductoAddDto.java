package com.example.shopall.data.dto;

import lombok.Getter;
import lombok.Setter;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;


import jakarta.validation.constraints.Positive;
import org.springframework.validation.annotation.Validated;

@Setter
@Getter
@Validated
public class ProductoAddDto {


    @NotNull(message = "El id del producto debe ser valido")
    @Positive(message = "El id del producto debe ser valido")
    private int idProducto;

    @NotNull(message = "El id de la categoria debe ser valido")
    @Positive(message = "El id de la categoria debe ser valido")
    private int idCategoria;


    @NotNull(message = "La cantidad debe ser valida")
    @Positive(message = "La cantidad debe ser valida")
    private int cantidad;
    private double precio;
    private double total;

    public ProductoAddDto(int idProducto, int idCategoria, int cantidad, double precio, double total){
        this.idProducto = idProducto;
        this.idCategoria = idCategoria;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }
}
