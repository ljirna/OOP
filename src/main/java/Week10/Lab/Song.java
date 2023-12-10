package Week10.Lab;

import java.util.ArrayList;

public class Song {
    private String title;
    private String artist;
    private String genre;

    public Song (String title, String artist, String genre){
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

class SMain {
    public static void main(String[] args){
        ArrayList<Song> playlist = new ArrayList<>();
        playlist.add(new Song("Montreal", "The Weeknd", "R&B"));
        playlist.add(new Song("Bohemian Rhapsody", "Queen", "Rock"));
        playlist.add(new Song("Summertime Sadness", "Lana Del Rey", "Indie Pop"));

        GenreFilterIterator genreFilterIterator = new GenreFilterIterator(playlist, "R&B");
        GenreFilterIterator genreFilteriterator = new GenreFilterIterator(playlist, "Indie Pop");

        while (genreFilterIterator.hasNext()){
            Song song = genreFilterIterator.next();
            System.out.println("Title : " + song.getTitle() + "\n" + "Artist: " + song.getArtist());
        }
        while(genreFilteriterator.hasNext()){
            Song song1 = genreFilteriterator.next();
            System.out.println("Title : " + song1.getTitle() + "\n" + "Artist: " + song1.getArtist());
        }
    }
}