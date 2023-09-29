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
    public UsuarioDto createUsuario(@RequestBody UsuarioDto usuarioDto) {
        return usuarioService.createUsuario(usuarioDto);
    }
}
