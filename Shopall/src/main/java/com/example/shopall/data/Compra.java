package com.example.shopall.data;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "compra")

public class Compra {

            @Id
            @Column(name = "idcompra", nullable = false)
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Integer id;

            @Column(name = "fecha", nullable = false)
            private Date fecha;

            @Column(name = "cantidad", nullable = false)
            private Integer cantidad;

            @Column(name = "total", nullable = false)
            private Double total;

            @ManyToOne
            @JoinColumn(name = "idusuario", nullable = false)
            private Usuario usuario;

            @ManyToOne
            @JoinColumn(name = "idforma_pago", nullable = false)
            private FormaPago formaPago;

            @OneToMany(mappedBy = "compra", cascade = CascadeType.ALL)
            private List<CompraProducto> compraproducto;
}
