package day33_a_static;
/*
4 fields/instance variables
 */
public class Song {
    String name;
    double length;
    String artist;
    String genre;

    public Song (String name){
        this.name = name;
    }
    public Song (String name, double length){
        this(name);
        this.length = length;
    }
    public Song(String name, double length, String artist){
        this(name, length);
        this.artist = artist;
    }
    public Song (String name, double length, String artist, String genre){
        this(name, length, artist);
        this.genre = genre;
    }

    @Override
    public String toString() {

        //String lengthResult = length != 0.0 ? length + "": "There is no length value";

        return "Song: \n\tname: "+ name +
                "\n\tlength: " + (length != 0.0 ? length: "There is no length value") +
                "\n\tartist: " + artist +
                "\n\tgenre:  "+ genre;
    }
}
