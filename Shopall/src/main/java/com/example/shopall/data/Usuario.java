package com.example.shopall.data;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "usuario")
public class Usuario {

        @Id
        @Column(name = "idusuario", nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "nombre", nullable = false)
        private String nombre;

        @Column(name = "apellidos", nullable = false)
        private String apellidos;

        @Column(name = "email", nullable = false)
        private String email;

}
