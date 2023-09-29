package com.example.shopall.data;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter

@Entity
@Table(name = "almacen")
public class Almacen {

        @Id
        @Column(name = "id", nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "estatus", nullable = false)
        private boolean estatus;

        @OneToOne
        @JoinColumn(name = "usuario")
        private Usuario usuario;

        @ManyToMany(mappedBy = "almacen")
        private List<Producto> productos;
}
