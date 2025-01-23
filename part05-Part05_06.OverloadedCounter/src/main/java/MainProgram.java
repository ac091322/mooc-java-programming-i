
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(10);

        counter1.increase();
        counter1.decrease();
        counter1.increase();
        counter1.increase();
        counter1.decrease();
        counter1.increase(100);
        counter1.decrease(25);

        counter2.decrease(80);
        counter2.increase();
        counter2.decrease(5);
        counter2.increase();
        counter2.increase(55);
        counter2.decrease(9);

        System.out.println(counter1.value());
        System.out.println(counter2.value());

        System.out.println(counter1);
        System.out.println(counter2);
    }
}
