
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        int givenNum = Integer.valueOf(scanner.nextLine());
        
        // if one operand in the operation using the + is a string, the other will be converted into a string
        System.out.println("You gave the number " + givenNum);
    }
}
Ï