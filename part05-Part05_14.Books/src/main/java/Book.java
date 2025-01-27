
import java.util.Objects;

public class Book {

    private final String name;
    private final int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // only implement this if we want to the same book name and publication year to determine if it is added to the book list
    // books with the same name and publication year will not be added to the book list, even if they are a different reference in memory
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Book)) {
            return false;
        }

        Book comparedBook = (Book) compared;
        if (this.name.equals(comparedBook.name) && this.publicationYear == comparedBook.publicationYear) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, publicationYear);
    }

    @Override
    public String toString() {
        return String.format("%s, %d", this.name, this.publicationYear);
    }
}
