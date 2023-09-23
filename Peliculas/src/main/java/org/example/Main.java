package org.example;

import org.example.controllers.GestorPelicula;
import org.example.models.Pelicula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        GestorPelicula gp = new GestorPelicula();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        // Agregar peliculas
        Pelicula p1 = new Pelicula(1, "El señor de los anillos", true);
        Pelicula p2 = new Pelicula(2, "Volver al futuro", false);
        Pelicula p3 = new Pelicula(3, "El Padrino", true);

        gp.agregarPelicula(p1);
        gp.agregarPelicula(p2);
        gp.agregarPelicula(p3);

        System.out.println("Bienvenido a Blockbuster");

        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("Que desea hacer?");
            System.out.println("1. Eliminar pelicula");
            System.out.println("2. Marcar pelicula como disponible");
            System.out.println("3. Mostrar peliculas no disponibles");
            System.out.println("0. Salir");
            System.out.println("----------------------------------------");

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    gp.mostrarPeliculas();
                    System.out.println("Ingrese el id de la pelicula a eliminar");
                    opcion = scanner.nextInt();

                    if (gp.eliminarPelicula(opcion)) {
                        System.out.println("Pelicula eliminada");
                    } else {
                        System.out.println("No se encontro la pelicula");
                    }
                    break;
                case 2:
                    gp.mostrarPeliculas();
                    System.out.println("Ingrese el id de la pelicula a marcar como disponible");
                    opcion = scanner.nextInt();
                    if (gp.marcarPeliculaComoDisponible(opcion)) {
                        System.out.println("Pelicula marcada como disponible");
                    } else {
                        System.out.println("No se encontro la pelicula");
                    }
                    break;
                case 3:
                    System.out.println("Peliculas no disponibles:");
                    gp.obtenerPeliculaNoDisponible();
                    break;
                case 0:
                    System.out.println("Adios");
                    System.exit(0);
                default:
                    System.out.println("Opcion invalida");
                    break;
            }


        }


    }
}