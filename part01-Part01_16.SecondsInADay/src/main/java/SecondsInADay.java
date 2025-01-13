
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());
        
        int hoursInDay = 24;
        int minutesInHour = 60;
        int secondsInMinute = 60; 
        
        // the evaluation of an expression is always performed before its value is assigned to the variable
        int result = hoursInDay * minutesInHour * secondsInMinute * days;
        
        System.out.println(result);
    }
}
