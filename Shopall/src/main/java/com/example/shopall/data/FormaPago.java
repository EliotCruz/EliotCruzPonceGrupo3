package com.example.shopall.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "forma_pago")
public class FormaPago {

        @Id
        @Column(name = "idforma_pago", nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "nombre", nullable = false)
        private String nombre;

        @Column(name = "descripcion", nullable = false)
        private String descripcion;
}
