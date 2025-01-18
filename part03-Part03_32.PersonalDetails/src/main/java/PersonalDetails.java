
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> years = new ArrayList<>();
        String longestName = "";

        while (true) {
            String nameYear = scanner.nextLine();

            if (nameYear.equals("")) {
                break;
            }

            String[] stringToArray = nameYear.split(",");
            years.add(Integer.valueOf(stringToArray[1]));

            if (stringToArray[0].length() > longestName.length()) {
                longestName = stringToArray[0];
            }
        }

        int sum = 0;
        for (int year : years) {
            sum += year;
        }
        double average = (double) sum / years.size();

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
