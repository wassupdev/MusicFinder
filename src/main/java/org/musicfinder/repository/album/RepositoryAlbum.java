package org.musicfinder.repository.album;

import org.musicfinder.models.Album;
import org.musicfinder.models.Musica;

import java.util.ArrayList;
import java.util.List;

public class RepositoryAlbum {
    public List<Album> getAlbumsByName(String nome) {return new ArrayList<Album>();
    }

    public Album findAlbumById (Integer id) {
        return new Album();
    }

    public List<Album> getAlbumsFromArtist(String artista) {return new ArrayList<Album>();
    }


}
