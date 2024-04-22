package com.jim92.radio.modelos;

public class MisFavoritos {
    public void adicione(Audio audio){
        if (audio.getClasificacion()<=8){
            System.out.println(audio.getTitulo() + "Es uno de los favoritos del momentos");
        }else {
            System.out.println(audio.getTitulo() + " tambien es uno de los favoritos");
        }
    }
}
