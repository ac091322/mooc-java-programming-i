
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        System.out.println(strings);

        removeLast(strings);
    }

    public static void removeLast(ArrayList<String> strings) {
        // cannot use strings.size() - 1, integer values are not truthy or falsey, must use actual comparison operators
        if (strings.size() > 0) {
            strings.remove(strings.size() - 1);
        }

        System.out.println(strings);
    }
}
