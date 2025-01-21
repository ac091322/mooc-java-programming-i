
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchFor = scanner.nextLine();

        boolean found = false;

        try ( Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNext()) {
                String line = reader.nextLine();

                if (line.contains(searchFor)) {
                    System.out.println("Found!");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Not found.");
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }
    }
}
