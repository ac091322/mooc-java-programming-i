
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int maxRange = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from?");
        int startRange = Integer.valueOf(scanner.nextLine());

        for (int i = startRange; i <= maxRange; i += 1) {
            System.out.println(i);
        }
    }
}
