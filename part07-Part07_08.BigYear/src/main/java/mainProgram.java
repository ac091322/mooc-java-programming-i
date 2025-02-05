
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        BirdDatabase db = new BirdDatabase();
        testBirdDatabase(db);

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();

                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();

                db.addBird(new Bird(name, latinName));
            }

            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();

                db.observation(name);
            }

            if (command.equals("All")) {
                System.out.println(db);
            }

            if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();

                System.out.println(db.getBird(name));
            }
        }
    }

    public static void testBirdDatabase(BirdDatabase db) {
        db.addBird(new Bird("Sparrow", "Passer domesticus"));
        db.addBird(new Bird("Eagle", "Aquila chrysaetos"));

        db.observation("Sparrow");
        db.observation("Sparrow");
        db.observation("Eagle");

        System.out.println(db);
    }
}
