package com.example.shopall.data.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

@Getter
@Setter
public class UsuarioDto implements Serializable{
     Integer id;
     String Nombre;
     String Apellidos;
     String Email;

        public UsuarioDto(Integer id, String Nombre, String Apellidos, String Email){
            this.id = id;
            this.Nombre = Nombre;
            this.Apellidos = Apellidos;
            this.Email = Email;
        }
}
