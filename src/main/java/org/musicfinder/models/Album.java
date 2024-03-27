package org.musicfinder.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)


public class Album {
        @JsonProperty("ID")
        private Integer ID;
        @JsonProperty("nome")
        private String nome;
        @JsonProperty("source_cover")
        private String source_cover;
        @JsonProperty("soundtrack")
        private List <Musica> soundtrack;

        public Album() {

        }
}


