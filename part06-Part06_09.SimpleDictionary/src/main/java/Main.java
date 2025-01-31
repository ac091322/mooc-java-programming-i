
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        dictionary.add("one", "yksi");
        dictionary.add("two", "kaksi");

        System.out.println(dictionary.translate("one"));
        System.out.println(dictionary.translate("two"));
        System.out.println(dictionary.translate("three"));

        TextUI ui = new TextUI(scanner, dictionary);
        ui.start();
    }
}
