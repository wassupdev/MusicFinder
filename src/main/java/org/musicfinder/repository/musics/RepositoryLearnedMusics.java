package org.musicfinder.repository.musics;

import org.musicfinder.models.Musica;

import java.util.ArrayList;
import java.util.List;

public class RepositoryLearnedMusics {

    public List<Musica> getLearnedMusics() {return new ArrayList<Musica>();
    }

    public List<Musica> getLearnedMusicsByName(String nome) {return new ArrayList<Musica>();
    }

    public List<Musica> removeMusicFromLearned(Musica musica) {return new ArrayList<Musica>();
    }
}
