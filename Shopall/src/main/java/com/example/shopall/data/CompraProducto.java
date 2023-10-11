package com.example.shopall.data;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "compra_producto")

public class CompraProducto {

            @Id
            @Column(name = "idcompra_producto", nullable = false)
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Integer id;


            @ManyToOne
            @JoinColumn(name = "idcompra", nullable = false)
            private Compra compra;

            @ManyToOne
            @JoinColumn(name = "idproducto", nullable = false)
            private Producto producto;

            @Column(name = "cantidad", nullable = false)
            private Integer cantidad;

            @Column(name = "precio", nullable = false)
            private Double precio;

            @Column(name = "subtotal", nullable = false)
            private Double subtotal;
}
