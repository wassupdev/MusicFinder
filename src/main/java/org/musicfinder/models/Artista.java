package org.musicfinder.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Artista {
        private Integer id;
        private String nome;

    public Artista(String nome) {
           this.nome = nome;
    }

}