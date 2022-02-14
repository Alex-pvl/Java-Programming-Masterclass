package ru.alexpvl;

import ru.alexpvl.model.Artist;
import ru.alexpvl.model.Datasource;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if (!datasource.open()) {
            System.out.println("Can't open this source");
            return;
        }
        List<Artist> artists = datasource.queryArtists(1);
        artists.forEach((artist -> System.out.println(artist.getId() + "|" + artist.getName())));
        datasource.close();
    }
}
