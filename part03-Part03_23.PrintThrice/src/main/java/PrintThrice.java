
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        String word = String.valueOf(scanner.nextLine());
        System.out.println(word.repeat(3));
    }
}
