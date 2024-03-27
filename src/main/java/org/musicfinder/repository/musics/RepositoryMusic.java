package org.musicfinder.repository.musics;

import org.musicfinder.models.Album;
import org.musicfinder.models.Musica;

import java.util.ArrayList;
import java.util.List;

public class RepositoryMusic {
    public List<Musica> listMusicByALbum(Album album) {
        return album.getSoundtrack();
    }

    public Musica findMusicById (Integer id) {
        return new Musica();
    }

    public List<Musica> getMusicsByName(String nome) {
        return new ArrayList<Musica>();
    }
}
