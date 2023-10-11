package com.example.shopall.controllers;

import com.example.shopall.data.dto.ProductoDto;
import com.example.shopall.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/getProductos")
    public List<ProductoDto> getAllProductos() {
        return productoService.getAllProductos();
    }

    @PostMapping("/createProducto")
    public ProductoDto createProducto(@RequestBody ProductoDto productoDto) {
        return productoService.createProducto(productoDto);
    }
}
