package com.example.shopall.controllers;

import com.example.shopall.data.dto.CompraDto;
import com.example.shopall.data.dto.ProductoDto;
import com.example.shopall.service.CompraService;
import com.example.shopall.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compras")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping("/createCompra")
    public CompraDto createCompra(@RequestBody CompraDto compraDto) {
        return compraService.createCompra(compraDto);
    }

}
