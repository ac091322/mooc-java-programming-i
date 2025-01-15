
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int int1 = Integer.valueOf(scanner.nextLine());
        int int2 = Integer.valueOf(scanner.nextLine());
        
        if (int1 > int2) {
            System.out.println(int1 + " is greater than " + int2 + ".");
        } else if (int1 < int2) {
            System.out.println(int1 + " is smaller than " + int2 + ".");
        } else {
            System.out.println(int1 + "is equal to " + int2 + ".");
        }
    }
}
