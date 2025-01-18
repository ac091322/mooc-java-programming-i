
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // for (int i = 0; i < array.length; i += 1) {
        // System.out.println("*".repeat(array[i]));
        // }

        for (int numberOfStars : array) {
            printStars(numberOfStars);
            System.out.println("");
        }
    }

    public static void printStars(int numberOfStars) {
        while (numberOfStars > 0) {
            System.out.print("*");
            numberOfStars -= 1;
        }
    }
}
