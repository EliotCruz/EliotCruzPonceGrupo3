package com.example.shopall.controllers;
import com.example.shopall.data.dto.CategoriaDto;
import com.example.shopall.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/getCategorias")
    public List<CategoriaDto> getAllCategorias() {
        return categoriaService.getAllCategorias();
    }

    @PostMapping("/createCategoria")
    public CategoriaDto createCategoria(@RequestBody CategoriaDto categoriaDto) {
        return categoriaService.createCategoria(categoriaDto);
    }
}
