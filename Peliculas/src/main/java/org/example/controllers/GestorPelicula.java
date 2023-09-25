package org.example.controllers;

import org.example.models.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class GestorPelicula {

    private List<Pelicula> peliculas;

    public GestorPelicula() {
        peliculas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void mostrarPeliculas() {
        if (peliculas.isEmpty()) {
            System.out.println("No hay películas en la lista.");
        } else {
            for (Pelicula pelicula : peliculas) {
                System.out.println(pelicula.getId() + " - " + pelicula.getNombre());
            }
        }
    }

    public boolean eliminarPelicula(int id) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getId().equals(id)) {
                peliculas.remove(pelicula);
                return true;
            }
        }
        return false;
    }

    public void obtenerPeliculaDisponible() {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDisponible()) {
                System.out.println(pelicula);
            }
        }
    }

    public void obtenerPeliculaNoDisponible() {
        for (Pelicula pelicula : peliculas) {
            if (!pelicula.getDisponible()) {
                System.out.println(pelicula.getId() + " - " + pelicula.getNombre());
            }
        }
    }

    public boolean marcarPeliculaComoDisponible(int id) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getId().equals(id)) {
                pelicula.setDisponible(true);
                return true;
            }
        }
        return false;
    }
}
