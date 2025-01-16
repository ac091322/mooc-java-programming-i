
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxRange = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i <= maxRange; i += 1) {
            System.out.println(i);
        }
    }
}
