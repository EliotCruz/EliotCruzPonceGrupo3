package com.example.shopall.service;

import com.example.shopall.data.Categoria;
import com.example.shopall.data.dto.CategoriaDto;
import com.example.shopall.repository.CategoriaRepository;
import com.example.shopall.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<CategoriaDto> getAllCategorias() {
        List<CategoriaDto> categorias = new ArrayList<>();
        categoriaRepository.findAll().forEach(
                categoria -> categorias.add(new CategoriaDto(
                        categoria.getId(),
                        categoria.getNombre(),
                        categoria.getDescripcion()
                ))
        );
        return categorias;
    }

    public CategoriaDto createCategoria(CategoriaDto categoriaDto) {
        Categoria categoria = new Categoria();
        categoria.setNombre(categoriaDto.getNombre());
        categoria.setDescripcion(categoriaDto.getDescripcion());
        categoriaRepository.save(categoria);
        return new CategoriaDto(categoria.getId(), categoria.getNombre(), categoria.getDescripcion());
    }
}
