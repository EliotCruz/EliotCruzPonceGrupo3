package com.example.shopall.service;

import com.example.shopall.data.Categoria;
import com.example.shopall.data.FormaPago;
import com.example.shopall.data.dto.CategoriaDto;
import com.example.shopall.data.dto.FormaPagoDto;
import com.example.shopall.repository.CategoriaRepository;
import com.example.shopall.repository.FormaPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FormaPagoService {
    @Autowired
    private FormaPagoRepository formaPagoRepository;

    public List<FormaPagoDto> getAllFormasPago() {
        List<FormaPagoDto> formasPago = new ArrayList<>();
        formaPagoRepository.findAll().forEach(
                formaPago -> formasPago.add(new FormaPagoDto(
                        formaPago.getId(),
                        formaPago.getNombre(),
                        formaPago.getDescripcion()
                ))
        );
        return formasPago;
    }

    public FormaPagoDto createFormaPago(FormaPagoDto formaPagoDto) {
        FormaPago formaPago = new FormaPago();
        formaPago.setNombre(formaPagoDto.getNombre());
        formaPago.setDescripcion(formaPagoDto.getDescripcion());
        formaPagoRepository.save(formaPago);
        return new FormaPagoDto(formaPago.getId(), formaPago.getNombre(), formaPago.getDescripcion());
    }
}
