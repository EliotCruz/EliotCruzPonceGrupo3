package com.example.shopall.controllers;
import com.example.shopall.data.dto.PerfilDto;
import com.example.shopall.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/perfil")
public class PerfilController {
    @Autowired
    private PerfilService perfilService;


}
