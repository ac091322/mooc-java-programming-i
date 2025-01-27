
import java.util.Objects;

public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    // must use Object comparedObj and not the class name
    public boolean equals(Object comparedSong) {
        // if the variables are located in the same position, they are equal
        if (this == comparedSong) {
            return true;
        }

        // if the compared object is not of type Person, the objects are not equal
        if (!(comparedSong instanceof Song)) {
            return false;
        }

        // must cast the Object type comparedSong into a Song type object
        // Java requires this even though we already know comparedSong is an instance of Song
        Song comparedSongObj = (Song) comparedSong;
        if (this.artist.equals(comparedSongObj.artist) && this.name.equals(comparedSongObj.name) && this.durationInSeconds == comparedSongObj.durationInSeconds) {
            return true;
        }

        return false;
    }

    // only relevant for hash-based collections like HashMap, HashSet, or HashTabl
    @Override
    public int hashCode() {
        return Objects.hash(artist, name, durationInSeconds);
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
}
