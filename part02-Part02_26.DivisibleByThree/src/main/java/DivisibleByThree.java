
public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(3, 30);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        int i = beginning;
        while (i <= end) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i += 1;
        }
    }
}
