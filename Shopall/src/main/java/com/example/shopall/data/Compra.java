package com.example.shopall.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.print.Book;
import java.util.List;

@Getter
@Setter

@Entity
@Table(name = "compra")
public class Compra {

        @Id
        @Column(name = "id", nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "fecha", nullable = false)
        private String fecha;

        @Column(name = "total", nullable = false)
        private double total;

        @Column(name = "estatus", nullable = false)
        private boolean estatus;

        @ManyToOne
        @JoinColumn(name = "usuario")
        private Usuario usuario;

        @ManyToMany(mappedBy = "compra")
        private List<Producto> productos;
}
