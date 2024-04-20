package org.musicfinder.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

@Entity
public class Album {
        @JsonProperty("ID")
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer ID;
        @JsonProperty("nome")
        @Column(name = "nome")
        private String nome;
        @JsonProperty("source_cover")
        @Column(name = "url")
        private String source_cover;
        @JsonProperty("soundtrack")
        @OneToMany(mappedBy = "idAlbum")
        private List <Musica> soundtrack;

        public Album() {

        }
}


