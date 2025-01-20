
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here the program that allows the user to enter
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Year: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }
        // while (true) {
        // System.out.println("Title, pages, year: ");
        // String newBook = scanner.nextLine();
        //
        // if (newBook.isEmpty()) {
        // break;
        // }
        //
        // String[] splitBook = newBook.split(", ");
        // String title = splitBook[0];
        // int pages = Integer.valueOf(splitBook[1]);
        // int year = Integer.valueOf(splitBook[2]);
        //
        // books.add(new Book(title, pages, year));
        // }

        System.out.print("What information will be printed? ");
        String printCommand = scanner.nextLine();
        System.out.println("");

        for (Book book : books) {
            if (printCommand.equals("everything")) {
                System.out.println(book);
            } else if (printCommand.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
