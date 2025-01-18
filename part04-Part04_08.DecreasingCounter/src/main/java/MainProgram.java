
public class MainProgram {

    public static void main(String[] args) {
        DecreasingCounter counter1 = new DecreasingCounter(10);
        DecreasingCounter counter2 = new DecreasingCounter(100);

        counter1.printValue();
        counter1.decrement();
        counter1.decrement();

        counter2.printValue();
        counter2.decrement();
        counter2.decrement();
        counter2.decrement();
        counter2.decrement();
        counter2.decrement();
        counter2.reset();
    }
}
