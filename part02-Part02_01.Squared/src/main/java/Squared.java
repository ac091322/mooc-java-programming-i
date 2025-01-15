
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int integer = Integer.valueOf(scanner.nextLine());
        // java does not have the operator **2 for squared
        System.out.println(Math.pow(integer, 2));
    }
}
