package com.example.shopall.data.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

@Getter
@Setter
public class UsuarioDto implements Serializable{

        private Integer id;
        private String user;

        private PerfilDto perfil;


        public UsuarioDto(Integer id, String user) {
                this.id = id;
                this.user = user;
        }

}
