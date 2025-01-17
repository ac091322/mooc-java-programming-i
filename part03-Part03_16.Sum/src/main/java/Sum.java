
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        sum(numbers);
    }

    public static int sum(ArrayList<Integer> numbers) {
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return sum;
    }
}
