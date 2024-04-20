package org.musicfinder.repository.usuarios;

import org.musicfinder.models.Usuarios;

import java.util.ArrayList;
import java.util.List;

public class RepositoryUsuarios {
    public Usuarios updateUsuarioInformacoes(String update) {
        return new Usuarios();
    }

    public List<Usuarios> getUsuariosByNome(String nome) {
        return new ArrayList<Usuarios>();
    }

    public Usuarios deleteUsuarioById(Integer id) {
        return new Usuarios();
    }

    public Usuarios getUsuarioById(Integer id) {
        return new Usuarios();
    }
}


