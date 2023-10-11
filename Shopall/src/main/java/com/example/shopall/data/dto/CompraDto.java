package com.example.shopall.data.dto;

import java.util.Date;
import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;

@Getter
@Setter
@Validated
public class CompraDto {

    private int idCompra;
    @NotNull(message = "El id del usuario debe ser valido")
    @Positive(message = "El id del usuario debe ser valido")
    private int idUsuario;
    @NotNull(message = "El id de la forma de pago debe ser valido")
    @Positive(message = "El id de la forma de pago debe ser valido")
    private int idFormaPago;
    private double total;
    private int cantidad;
    private Date fecha;
    @Valid
    private List<ProductoAddDto> productos;

    public CompraDto(int idCompra, int idUsuario, int idFormaPago, double total, int cantidad, Date fecha, List<ProductoAddDto> productos){
        this.idCompra = idCompra;
        this.idUsuario = idUsuario;
        this.idFormaPago = idFormaPago;
        this.total = total;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.productos = productos;
    }
}
