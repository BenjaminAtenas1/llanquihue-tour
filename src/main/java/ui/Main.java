package ui;

import data.GestorDatos;
import model.Tour;

public class Main {
    public static void main(String[] args) {
        GestorDatos datos = new GestorDatos();
        //Acá podemos ver que se muestra la información del archivo tours.txt con el metodo cargarTours separados por el metodo split
        datos.cargarTours();

        System.out.println("\n>LISTA DE TOURS<");
        //Acá se muestra los datos del archivo tours.txt con un bucle for each
        for (Tour tour : datos.getListaTours()) {
            System.out.println(tour);
        }
        //Acá se muestra un ejemplo de que se filtra por una condicion (en este caso, si el tour es para 6 o más personas)
        System.out.println("\n>TOURS PARA 6 O MÁS PERSONAS<");

        for (Tour tour : datos.getListaTours()) {

            if (tour.getCantidadMaxPersonas() >= 6) {
                System.out.println(tour);
            }
        }
        //Acá se muestra otro ejemplo que se filtra por una condición (ahora por precio)
        System.out.println("\n>TOURS SOBRE $100.000<");

        for (Tour tour : datos.getListaTours()) {

            if (tour.getPrecio() > 100000) {
                System.out.println(tour);
            }
        }

    }
}