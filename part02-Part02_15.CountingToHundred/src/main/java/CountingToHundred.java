
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startRange = Integer.valueOf(scanner.nextLine());

        for (int i = startRange; i < 101; i += 1) {
            System.out.println(i);
        }
    }
}
