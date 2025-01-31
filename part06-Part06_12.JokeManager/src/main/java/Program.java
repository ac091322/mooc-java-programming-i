
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        JokeManager jokeManager = new JokeManager();
        jokeManager.addJoke("What is red and smells of blue paint? - Red paint.");
        jokeManager.addJoke("What is blue and smells of red paint? - Blue paint.");

        jokeManager.printJokes();
        System.out.println();
        System.out.println(jokeManager.drawJoke());

        System.out.println();

        UserInterface ui = new UserInterface(jokeManager, scanner);
        ui.start();
    }
}
