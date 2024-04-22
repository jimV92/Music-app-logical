package com.jim92.radio.principal;

import com.jim92.radio.modelos.Cancion;
import com.jim92.radio.modelos.MisFavoritos;
import com.jim92.radio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Jim Cancion ");
        miCancion.setCantante("Cancion de Jim ");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Jim Podcast ");
        miPodcast.setTitulo("Podcast con Jim ");

        //CANCIONES
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }

        //PODCAST
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }



        System.out.println("Total de reproducciones: "+miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta: "+miCancion.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);
    }
}
