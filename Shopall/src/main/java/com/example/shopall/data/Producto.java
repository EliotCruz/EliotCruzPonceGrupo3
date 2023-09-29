package com.example.shopall.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

@Entity
@Table(name = "producto")
public class Producto {

            @Id
            @Column(name = "id", nullable = false)
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Integer id;

            @Column(name = "nombre", nullable = false)
            private String nombre;

            @Column(name = "descripcion", nullable = false)
            private String descripcion;

            @Column(name = "precio", nullable = false)
            private double precio;

            @Column(name = "estatus", nullable = false)
            private boolean estatus;

            @ManyToOne
            @JoinColumn(name = "categoria")
            private Categoria categoria;


            @JoinTable(
                    name = "almacen_producto",
                    joinColumns = @JoinColumn(name = "producto_id"),
                    inverseJoinColumns = @JoinColumn(name="almacen")
            )
            @ManyToMany(cascade = CascadeType.ALL)
            private List<Almacen> almacen;



            @JoinTable(
                    name = "compra_prodcuto",
                    joinColumns = @JoinColumn(name = "compra_id"),
                    inverseJoinColumns = @JoinColumn(name="producto")
            )
            @ManyToMany(cascade = CascadeType.ALL)
            private List<Compra> compra;



}
