package com.example.shopall.data;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "producto")
public class Producto {

            @Id
            @Column(name = "idproducto", nullable = false)
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Integer id;

            @Column(name = "nombre", nullable = false)
            private String nombre;

            @Column(name = "descripcion", nullable = false)
            private String descripcion;

            @Column(name = "inventario", nullable = false)
            private Integer inventario;

            @Column(name = "precio", nullable = false)
            private Double precio;

            @ManyToOne
            @JoinColumn(name = "idcategoria", nullable = false)
            private Categoria categoria;


}
