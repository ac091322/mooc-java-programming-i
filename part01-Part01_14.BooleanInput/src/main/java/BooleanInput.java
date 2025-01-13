
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Write something:");
        boolean statement = Boolean.valueOf(scanner.nextLine());
        // anything other than "true" will print "false"
        // "true" is case-insensitive, so "tRUe" also prints "true
        System.out.println("True or false? " + statement);
    }
}
