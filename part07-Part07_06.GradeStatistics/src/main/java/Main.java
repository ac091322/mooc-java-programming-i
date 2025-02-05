
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> points = new ArrayList<>();

        System.out.println("Enter point totals, - 1 stops:");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            if (input >= 0 && input <= 100) {
                points.add(input);
            }
        }

        System.out.println("Point average (all): " + String.format("%.1f", pointAverage(points)));
        System.out.println("Point average of passing: " + String.format("%.1f", pointAverageOfPassing(points)));
        System.out.println("Passing percentage: " + passingPercentage(points));
        gradeDistribution(points);
    }

    public static double pointAverage(ArrayList<Integer> points) {
        int sum = 0;

        for (int num : points) {
            sum += num;
        }

        return (double) sum / points.size();
    }

    public static double pointAverageOfPassing(ArrayList<Integer> points) {
        int sum = 0;
        int count = 0;

        for (int num : points) {
            if (num >= 50) {
                sum += num;
                count += 1;
            }
        }

        return (double) sum / count;
    }

    public static double passingPercentage(ArrayList<Integer> points) {
        int passingCount = 0;

        for (int num : points) {
            if (num >= 50) {
                passingCount += 1;
            }
        }

        return 100.0 * passingCount / (double) points.size();
    }

    public static void gradeDistribution(ArrayList<Integer> points) {
        int[] grades = new int[6];

        for (int num : points) {
            if (num >= 90) {
                grades[5] += 1;
            } else if (num >= 80) {
                grades[4] += 1;
            } else if (num >= 70) {
                grades[3] += 1;
            } else if (num >= 60) {
                grades[2] += 1;
            } else if (num >= 50) {
                grades[1] += 1;
            } else {
                grades[0] += 1;
            }
        }

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");

            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
