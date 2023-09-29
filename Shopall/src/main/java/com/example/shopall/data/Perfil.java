package com.example.shopall.data;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "perfil")
public class Perfil {

        @Id
        @Column(name = "id", nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "nombre", nullable = false)
        private String nombre;

        @Column(name = "apellidos", nullable = false)
        private String apellidos;

        @Column(name = "rfc", nullable = false)
        private String rfc;

        @Column(name = "domicilio", nullable = false)
        private String domicilio;

        @Column(name = "telefono", nullable = false)
        private String telefono;

        @Column(name = "tipo", nullable = false)
        private Integer tipo;

        @OneToOne
        @JoinColumn(name = "usuario")
        private Usuario usuario;
}
