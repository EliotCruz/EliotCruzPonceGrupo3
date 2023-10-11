package com.example.shopall.controllers;

import com.example.shopall.data.dto.UsuarioDto;
import com.example.shopall.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/getUsuarios")
    public List<UsuarioDto> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    @PostMapping("/createUsuario")
    public String createUsuario(@RequestBody UsuarioDto usuarioDto) {
        if (usuarioDto.getNombre().isEmpty())
            throw new RuntimeException("El nombre no puede estar vacio");
        if (usuarioDto.getApellidos().isEmpty())
            throw new RuntimeException("El apellido no puede estar vacio");
        if (usuarioDto.getEmail().isEmpty())
            throw new RuntimeException("El correo no puede estar vacio");
        usuarioService.createUsuario(usuarioDto);

        return "Usuario guardado";
    }
}