package com.example.shopall.controllers;
import com.example.shopall.data.dto.FormaPagoDto;
import com.example.shopall.service.FormaPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/formasPago")
public class FormaPagoController {

    @Autowired
    private FormaPagoService FormaPagoService;

    @GetMapping("/getFormaPagos")
    public List<FormaPagoDto> getAllFormaPagos() {
        return FormaPagoService.getAllFormasPago();
    }

    @PostMapping("/createFormaPago")
    public FormaPagoDto createFormaPago(@RequestBody FormaPagoDto FormaPagoDto) {
        return FormaPagoService.createFormaPago(FormaPagoDto);
    }
}
