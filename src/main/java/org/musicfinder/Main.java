package org.musicfinder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.musicfinder.models.Admin;
import org.musicfinder.models.Album;
import org.musicfinder.models.Musica;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("D:\\projetoprogramacao\\MusicFinder\\src\\main\\resources\\Album1.json");

        ObjectMapper mapper = new ObjectMapper();
        Album album = mapper.readValue(file, Album.class);

        //System.out.println(album.getNome());
        //System.out.println(album.getSoundtrack().get(0).getNome());

        for (Musica musica: album.getSoundtrack()) {

            ObjectMapper om = new ObjectMapper();
            om.setDefaultPropertyInclusion(JsonInclude.Include.NON_NULL);
            String jsonString = om.writeValueAsString(musica);
            //System.out.println(jsonString);
        }
        Admin admin = new Admin("João Silva", 30, "joaosilva", "senha123");
        System.out.println(admin.getUser_type());
        System.out.println(admin.getNome());


//        List<Musica> minhaSoundtrack = new ArrayList();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Adicionar novo álbum? (Y/N): ");
//        String condicional = scanner.nextLine();
//
//        Album album = new Album();
//
//        System.out.println("ID do álbum: ");
//        album.setID(Integer.parseInt(scanner.next()));
//        scanner.nextLine();
//        System.out.println("Nome do álbum: ");
//        album.setNome(scanner.nextLine());
//        System.out.println("Capa do álbum: ");
//        album.setSource_cover(scanner.nextLine());
//
//        System.out.println("Adicionar músicas ao álbum (Y/N)? ");
//        String condicionalMusica = scanner.next();
//        while (condicionalMusica.equals("Y")) {
//
//            System.out.print("ID da música: ");
//            Integer idmsc = Integer.parseInt(scanner.next());
//            scanner.nextLine();
//            System.out.print("nome da música: ");
//            String nomemusica = scanner.nextLine();
//            System.out.print("duracao da música: ");
//            Integer duracao = Integer.parseInt(scanner.next());
//            scanner.nextLine();
//            System.out.print("letra da música: ");
//            String letra = scanner.nextLine();
//            System.out.print("capa da música: ");
//            String capamusica = scanner.next();
//            System.out.print("id do álbum: ");
//            Integer idAlbum = Integer.parseInt(scanner.next());
//            scanner.nextLine();
//            System.out.print("id do artista: ");
//            Integer idArtista = Integer.parseInt(scanner.next());
//            scanner.nextLine();
//
//            minhaSoundtrack.add(new Musica(idmsc, nomemusica, duracao, letra, capamusica, idAlbum, idArtista));
//            System.out.println("Adicionar mais músicas ao álbum? ");
//            condicionalMusica = scanner.next();
//
//        }
//        album.setSoundtrack(minhaSoundtrack);
//        ObjectMapper om = new ObjectMapper();
//        om.setDefaultPropertyInclusion(JsonInclude.Include.NON_NULL);
//        String jsonString = om.writeValueAsString(album);
//        System.out.println(jsonString);
}
}