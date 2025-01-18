
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = -1;
        String oldestPerson = "";

        while (true) {
            String nameAge = scanner.nextLine();

            if (nameAge.equals("")) {
                break;
            }

            String[] stringToArray = nameAge.split(",");
            int age = Integer.valueOf(stringToArray[1]);
            String person = stringToArray[0];

            if (age > oldestAge) {
                oldestAge = age;
                oldestPerson = person;
            }
        }

        System.out.println("Name of the oldest: " + oldestPerson);
    }
}
