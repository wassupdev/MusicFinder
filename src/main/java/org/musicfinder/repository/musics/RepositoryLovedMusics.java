package org.musicfinder.repository.musics;

import org.musicfinder.models.Musica;

import java.util.ArrayList;
import java.util.List;

public class RepositoryLovedMusics {
    public List<Musica> getFavoritedMusics() {return new ArrayList<Musica>();
    }

    public List<Musica> addFavoritedMusic(Musica musica) {return new ArrayList<Musica>();
    }

    public Musica deleteFromFavoritedMusics(Musica musica) {return new Musica();
    }
}
