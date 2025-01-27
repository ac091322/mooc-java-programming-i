
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        plus();
        lessThan();
        minus();
    }

    public static void plus() {
        Money a = new Money(10, 0);
        Money b = new Money(5, 0);

        Money c = a.plus(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // a new Money object is created, and is placed at the end of the strand connected to a
        //  the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it
        a = a.plus(c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void lessThan() {
        Money a = new Money(10, 0);
        Money b = new Money(3, 0);
        Money c = new Money(5, 0);

        System.out.println(a.lessThan(b));
        System.out.println(b.lessThan(c));
    }

    public static void minus() {
        Money a = new Money(10, 0);
        Money b = new Money(3, 50);

        Money c = a.minus(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        c = c.minus(a);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
