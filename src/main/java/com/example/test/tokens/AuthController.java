package com.example.test.tokens;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {


    private JwtService jwtService;

    @PostMapping("/login")
    public String login(@RequestBody Usuario usuario) {
        if (!usuario.getUsername().equals("admin") || !usuario.getPassword().equals("admin")) {
            throw new RuntimeException("Usuario o contraseña incorrectos");
        }
        String token = jwtService.generarToken(usuario.getUsername());
        return token;
    }

    @GetMapping("/verify/{token}")
    public String verificarToken(@PathVariable String token) {
        String usuario = jwtService.validarToken(token);
        return "Token válido para el usuario: " + usuario;
    }
}

