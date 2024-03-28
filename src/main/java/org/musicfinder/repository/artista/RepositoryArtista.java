package org.musicfinder.repository.artista;

import org.musicfinder.models.Artista;

import java.util.ArrayList;
import java.util.List;

public class RepositoryArtista {
    public List<Artista> getArtistasByName(String nomeArtista) {return new ArrayList<Artista>();
    }

    public Artista getArtistaById(String idArtista) {return new Artista();}
}

