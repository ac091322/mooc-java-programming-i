
import java.nio.file.Paths;
import java.util.Scanner;
// import java.util.Arrays;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        try ( Scanner reader = new Scanner(Paths.get(file))) {

            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                String[] splitLine = line.split(",");
                String name = splitLine[0];
                String age = splitLine[1];
                // System.out.println(Arrays.toString(splitLine));

                String year = "years";

                if (Integer.valueOf(age) == 1) {
                    year = "year";
                }

                System.out.println(String.format("%s, age: %s %s", name, age, year));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
