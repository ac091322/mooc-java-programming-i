
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i += 1) {
            System.out.print("*");
        }

        System.out.println();
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i += 1) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);  // Print the leading spaces
            printStars(i);           // Print the stars
        }
    }

    public static void christmasTree(int height) {
        // Print the tree part (triangle)
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);  // Print spaces for alignment
            printStars(2 * i - 1);    // Print stars (odd numbers of stars)
        }

        // Print the base of the tree (3 stars wide, 2 stars high)
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);  // Center the base
            printStars(3);            // Print the base stars
        }
    }

    public static void main(String[] args) {
        printTriangle(5);
        System.out.println("---");

        christmasTree(4);
        System.out.println("---");

        christmasTree(10);
    }
}
