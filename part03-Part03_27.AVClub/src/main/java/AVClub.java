
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] stringToArray = input.split(" ");

            for (String substring : stringToArray) {
                if (substring.contains("av")) {
                    System.out.println(substring);
                }
            }
        }
    }
}
