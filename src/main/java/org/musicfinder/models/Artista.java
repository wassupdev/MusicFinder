package org.musicfinder.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Artista {
        private Integer id;
        private String nome;

    public Artista(String nome) {
           this.nome = nome;
    }

}