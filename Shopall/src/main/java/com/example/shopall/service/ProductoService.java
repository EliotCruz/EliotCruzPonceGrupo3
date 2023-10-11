package com.example.shopall.service;

import com.example.shopall.data.Categoria;
import com.example.shopall.data.Producto;
import com.example.shopall.data.dto.CategoriaDto;
import com.example.shopall.data.dto.ProductoDto;
import com.example.shopall.repository.CategoriaRepository;
import com.example.shopall.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<ProductoDto> getAllProductos() {
        List<ProductoDto> productos = new ArrayList<>();
        productoRepository.findAll().forEach(
                producto -> productos.add(new ProductoDto(
                        producto.getId(),
                        producto.getNombre(),
                        producto.getDescripcion(),
                        producto.getPrecio(),
                        producto.getInventario(),
                        producto.getCategoria().getId()
                ))
        );
        return productos;
    }

    public ProductoDto createProducto(ProductoDto productoDto) {
        Producto producto = new Producto();

        producto.setNombre(productoDto.getNombre());
        producto.setDescripcion(productoDto.getDescripcion());
        producto.setPrecio(productoDto.getPrecio());
        producto.setInventario(productoDto.getInventario());
        Categoria categoria = categoriaRepository.findById(productoDto.getIdcategoria()).orElse(null);
        producto.setCategoria(categoria);

        productoRepository.save(producto);
        productoDto.setId(producto.getId());

        return productoDto;


    }
}
