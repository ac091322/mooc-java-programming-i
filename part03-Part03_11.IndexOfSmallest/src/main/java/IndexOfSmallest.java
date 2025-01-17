
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program that reads user input
        // until the user enters 9999
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        int smallestNum = list.get(0);
        int i = 1;
        while (i < list.size()) {
            int num = list.get(i);

            if (num < smallestNum) {
                smallestNum = num;
            }

            i += 1;
        }

        System.out.println("Smallest number: " + smallestNum);

        for (int j = 0; j < list.size(); j += 1) {
            if (list.get(j) == smallestNum) {
                System.out.println("Found at index: " + j);
            }
        }
    }
}
