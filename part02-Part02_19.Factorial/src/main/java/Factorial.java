
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int input = Integer.valueOf(scanner.nextLine());

        int factorial = 1;

        for (int i = 1; i <= input; i += 1) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);
    }
}

// factorials can be used to calculate probability (five people can form 5! different lines)
