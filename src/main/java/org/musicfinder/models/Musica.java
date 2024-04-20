package org.musicfinder.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

@Entity
public class Musica {
        @JsonProperty("id")
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
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