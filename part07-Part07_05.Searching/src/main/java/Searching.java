
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());

        // generate a list of books to be created based on the number given
        for (int i = 0; i < numberOfBooks; i += 1) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");

        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");

        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");

        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }
    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        int i = 0;
        while (i < books.size()) {
            if (books.get(i).getId() == searchedId) {
                return i;
            }

            i += 1;
        }

        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        int beginIndex = 0;
        int endIndex = books.size() - 1;

        while (beginIndex <= endIndex) {
            int midIndex = (beginIndex + endIndex) / 2;
            int bookId = books.get(midIndex).getId();

            if (bookId == searchedId) {
                return midIndex;
            } else if (bookId < searchedId) {
                beginIndex = midIndex + 1;
            } else {
                endIndex = midIndex - 1;
            }
        }

        return -1;
    }
}
