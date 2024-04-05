package org.musicfinder.models;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Customer extends Usuarios {
    public Customer(String nome, Integer idade, String login, String senha) {
        super(nome, idade, login, senha);
        this.setUser_type("CUSTOMER");
    }

}
