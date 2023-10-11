package com.example.shopall.service;

import com.example.shopall.data.Compra;
import com.example.shopall.data.CompraProducto;
import com.example.shopall.data.Producto;
import com.example.shopall.data.dto.CompraDto;
import com.example.shopall.data.dto.ProductoAddDto;
import com.example.shopall.exceptions.EntityNotFoundException;
import com.example.shopall.repository.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {

    @Autowired
    private CompraRepository compraRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private FormaPagoRepository formaPagoRepository;

    @Autowired
    private CompraProductoRepository compraProductoRepository;


    @Transactional
    public CompraDto createCompra(CompraDto compraDto) {
        Compra compra = new Compra();
        compra.setCantidad(compraDto.getCantidad());
        compra.setFecha(compraDto.getFecha());
        compra.setTotal(compraDto.getTotal());

        compra.setUsuario(usuarioRepository.findById(
                compraDto.getIdUsuario()).orElseThrow(() -> new EntityNotFoundException("Usuario no encontrado")));

        compra.setFormaPago(formaPagoRepository.findById(
                compraDto.getIdFormaPago()).orElseThrow(() -> new EntityNotFoundException("Forma de pago no encontrada")));

        for (ProductoAddDto productoAddDto : compraDto.getProductos()) {
            Producto _producto = productoRepository.findById(
                    productoAddDto.getIdProducto()).orElseThrow(() -> new EntityNotFoundException("Producto no encontrado"));
            productoAddDto.setPrecio(_producto.getPrecio());
            productoAddDto.setTotal(productoAddDto.getCantidad() * _producto.getPrecio());
        }

        compraRepository.save(compra);

        for( ProductoAddDto productoAddDto : compraDto.getProductos()){
            CompraProducto compraProducto = new CompraProducto();
            Producto _producto = productoRepository.findById(
                    productoAddDto.getIdProducto()).orElseThrow(() -> new EntityNotFoundException("Producto no encontrado"));
            compraProducto.setProducto(_producto);
            compraProducto.setCompra(compra);
            compraProducto.setCantidad(productoAddDto.getCantidad());
            compraProducto.setPrecio(productoAddDto.getPrecio());
            compraProducto.setSubtotal(productoAddDto.getTotal());
            compraProductoRepository.save(compraProducto);
        }

        compraDto.setIdCompra(compra.getId());
        compraDto.setTotal(compra.getTotal());
        compraDto.setFecha(compra.getFecha());
        return compraDto;

    }
}
