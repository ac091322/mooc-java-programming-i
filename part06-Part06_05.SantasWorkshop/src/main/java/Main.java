
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift device = new Gift("iPhone16 Pro Max", 4);
        Gift furniture = new Gift("Marble Coffee Table", 15);

        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book);
        System.out.println("Gift: " + device);
        System.out.println("Gift: " + furniture);

        Package myPackage = new Package();
        myPackage.addGift(book);
        myPackage.addGift(device);
        myPackage.addGift(furniture);

        System.out.println(myPackage);

        System.out.println("Total weight: " + myPackage.totalWeight());
    }
}
