package org.musicfinder.models;

import lombok.NoArgsConstructor;
@NoArgsConstructor

public class Admin extends Usuarios {
    public Admin(String nome, Integer idade, String login, String senha) {
        super(nome, idade, login, senha);
        this.setUser_type("ADMIN");
    }
}
