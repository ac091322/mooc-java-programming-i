
import java.util.Scanner;
//import java.util.Arrays;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] splitString = input.split(" ");
            // System.out.println(Arrays.toString(splitString));

            for (String substring : splitString) {
                System.out.println(substring);
            }
        }
    }
}
