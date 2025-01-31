
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private final ArrayList<String> jokeManager;

    public JokeManager() {
        this.jokeManager = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokeManager.add(joke);
    }

    public String drawJoke() {
        System.out.println("Drawing jokes:");

        if (jokeManager.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokeManager.size());
            return jokeManager.get(index);
        }
    }

    public void printJokes() {
        System.out.println("Printing jokes:");
        jokeManager.forEach(joke -> System.out.println(joke));
    }
}
