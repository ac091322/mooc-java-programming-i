
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int inputNum = Integer.valueOf(scanner.nextLine());

            if (inputNum == 4) {
                break;
            }
        }
    }
}
