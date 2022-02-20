package ru.alexpvl;

import ru.alexpvl.model.Artist;
import ru.alexpvl.model.Datasource;
import ru.alexpvl.model.SongArtist;

import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if (!datasource.open()) {
            System.out.println("Can't open this source");
            return;
        }
        List<Artist> artists = datasource.queryArtists(1);
        artists.forEach((artist -> System.out.println(artist.getId() + "|" + artist.getName())));
        List<String> albumsForArtist = datasource.queryAlbumsForArtist("Iron Maiden", Datasource.ORDER_BY_ASC);
        for(String album : albumsForArtist) {
            System.out.println(album);
        }
        List<SongArtist> list = datasource.queryArtistsForSong("Go Your Own Way", Datasource.ORDER_BY_ASC);
        for (SongArtist sa : list) {
            System.out.println(sa.getArtistName() + "|" + sa.getAlbumName() + "|" + sa.getTrack());
        }

        datasource.querySongsMetaData();

        System.out.println(datasource.getCount(Datasource.TABLE_SONGS));

        datasource.createViewForSonsArtist();

        List<SongArtist> songArtistList = datasource.querySongInfoView(scanner.nextLine());
        for(SongArtist s : songArtistList) {
            System.out.println(s.getArtistName() + "|" +
                               s.getAlbumName() + "|" +
                               s.getTrack());
        }

        datasource.close();
    }

}
