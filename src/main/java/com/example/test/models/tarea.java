package com.example.test.models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="tarea")
public class tarea {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="fecha_inicio")
    private Date fecha_inicio;
    @Column(name="fecha_fin")
    private String fecha_fin;
    @Column(name="estado")
    private String estado;

    public tarea() {
    }

    public tarea(String nombre, String descripcion, Date fecha_inicio, String fecha_fin, String estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.estado = estado;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
