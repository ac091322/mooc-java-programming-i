
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        System.out.println("Give length of edge:");
        int edgeLength = Integer.valueOf(scanner.nextLine());

        Cube newCube = new Cube(edgeLength);
        System.out.println(newCube);
    }
}
