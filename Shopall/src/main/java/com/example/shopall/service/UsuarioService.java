package com.example.shopall.service;

import com.example.shopall.data.Usuario;
import com.example.shopall.data.dto.UsuarioDto;
import com.example.shopall.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioDto> getAllUsuarios() {
        List<UsuarioDto> usuarios = new ArrayList<>();
        usuarioRepository.findAll().forEach(usuario -> usuarios.add(new UsuarioDto(usuario.getId(), usuario.getUser())));
        return usuarios;
    }

    public UsuarioDto createUsuario(UsuarioDto usuarioDto) {
        Usuario usuario = new Usuario();
        usuario.setUser(usuarioDto.getUser());
        usuario.setPassword("123456");
        usuarioRepository.save(usuario);
        return new UsuarioDto(usuario.getId(), usuario.getUser());
    }

}
