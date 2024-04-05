package org.musicfinder.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Usuarios {
        private Integer ID;
        private String nome;
        private Integer idade;
        private String  login;
        private String  senha;
        private String user_type;

        public Usuarios(String nome, Integer idade, String login, String senha) {
                this.nome = nome;
                this.idade = idade;
                this.login = login;
                this.senha = senha;
        }

}

