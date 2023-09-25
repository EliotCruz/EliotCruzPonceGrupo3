package org.example.models;

public class Pelicula {

    private Integer id;
    private String nombre;
    private Boolean disponible;


    public Pelicula() {
    }

    public Pelicula(Integer id, String nombre, Boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.disponible = disponible;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

}
