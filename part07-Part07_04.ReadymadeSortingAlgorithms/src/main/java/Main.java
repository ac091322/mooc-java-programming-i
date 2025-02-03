
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {3, 1, 5, 99, 3, 12};
        sort(intArray);
        System.out.println(Arrays.toString(intArray));

        System.out.println("");

        String[] strArray = {"world", "hello", "morning", "x-ray", "ocean"};
        sort(strArray);
        System.out.println(Arrays.toString(strArray));

        System.out.println("");

        ArrayList<Integer> intArrayList = new ArrayList<>(List.of(3, 1, 5, 99, 3, 12));
        sortIntegers(intArrayList);
        System.out.println(intArrayList);

        System.out.println("");

        ArrayList<String> strArrayList = new ArrayList<>(List.of("world", "hello", "morning", "x-ray", "ocean"));
        sortStrings(strArrayList);
        System.out.println(strArrayList);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
