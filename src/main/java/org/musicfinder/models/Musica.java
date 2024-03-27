package org.musicfinder.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Musica {
        @JsonProperty("id")
        private Integer id;
        @JsonProperty("nome")
        private String nome;
        @JsonProperty("duracao")
        private Integer duracao;
        @JsonProperty("letra")
        private String  letra;
        @JsonProperty("source")
        private String  source;
        @JsonProperty("idAlbum")
        private Integer idAlbum;
        @JsonProperty("idArtista")
        private Integer idArtista;

    public Musica(String nome, Integer duracao, String letra, String source, Integer idAlbum, Integer idArtista) {
            this.nome = nome;
            this.duracao = duracao;
            this.letra = letra;
            this.source = source;
            this.idAlbum = idAlbum;
            this.idArtista = idArtista;
    }


}