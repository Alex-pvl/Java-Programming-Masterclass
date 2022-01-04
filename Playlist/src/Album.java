import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        if (this.songs.findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        } else {
            return false;
        }
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if ((trackNumber-1) >= 0 && (trackNumber-1) < this.songs.songs.size()) {
            playlist.add(this.songs.songs.get(trackNumber-1));
            return true;
        } else {
            return false;
        }
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        if (this.songs.findSong(title) != null) {
            playlist.add(this.songs.findSong(title));
            return true;
        } else {
            return false;
        }
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (!this.songs.contains(song)) {
                this.songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
            for (Song s : this.songs) {
                if (s.getTitle().equals(title)) {
                    return s;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            if ((trackNumber-1) > 0 && (trackNumber-1) < this.songs.size()) {
                return this.songs.get(trackNumber-1);
            }
            return null;
        }
    }
}
