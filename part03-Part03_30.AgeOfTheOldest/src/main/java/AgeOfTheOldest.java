
import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ageList = new ArrayList<>();

        while (true) {
            String nameAge = scanner.nextLine();

            if (nameAge.equals("")) {
                break;
            }

            String[] stringToArray = nameAge.split(",");
            ageList.add(Integer.valueOf(stringToArray[1]));
        }

        int oldestAge = ageList.get(0);

        for (int i = 1; i < ageList.size(); i += 1) {
            int age = ageList.get(i);
            if (age > oldestAge) {
                oldestAge = age;
            }
        }

        System.out.println("Age of the oldest: " + oldestAge);
    }
}
