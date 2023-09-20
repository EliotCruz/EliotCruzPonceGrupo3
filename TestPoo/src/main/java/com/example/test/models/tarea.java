package com.example.test.models;


import jakarta.persistence.*;
import org.springframework.dao.DataAccessException;

import java.util.Date;

@Entity
@Table(schema="todo")
public class tarea {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="fecha_inicio")
    private Date fecha_inicio;
    @Column(name="fecha_fin")
    private Date fecha_fin;
    @Column(name="estado")
    private String estado;

    public tarea() {
    }

    public tarea(long id, String nombre, String descripcion, Date fecha_inicio, Date fecha_fin, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.estado = estado;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public long getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public Date getFecha_inicio() {
        return this.fecha_inicio;
    }

    public Date getFecha_fin() {
        return this.fecha_fin;
    }

    public String getEstado() {
        return this.estado;
    }


}
