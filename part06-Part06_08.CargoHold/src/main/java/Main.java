
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Item book = new Item("The lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item jewelry = new Item("Blue Diamond", 3);
        Item tablet = new Item("iPad Pro", 2);
        Item brick = new Item("Red Brick", 4);

        ArrayList<Item> itemList = new ArrayList<>();
        Collections.addAll(itemList, book, phone, jewelry, tablet);
        testItem(itemList);

        System.out.println("");

        Suitcase mySuitcase = new Suitcase(5);
        Suitcase yourSuitcase = new Suitcase(10);
        mySuitcase.addItem(book);
        mySuitcase.addItem(phone);
        mySuitcase.addItem(jewelry);
        mySuitcase.addItem(brick);
        yourSuitcase.addItem(book);
        yourSuitcase.addItem(phone);
        yourSuitcase.addItem(jewelry);
        yourSuitcase.addItem(brick);
        testSuitcase(mySuitcase, yourSuitcase);

        System.out.println("");

        Hold cargoHold = new Hold(1000);
        testHold(cargoHold, mySuitcase, yourSuitcase);
    }

    public static void testItem(ArrayList<Item> itemList) {
        itemList.forEach(item -> System.out.println("Item's name: " + item.getName()));
        System.out.println("Item ArrayList: " + itemList);
    }

    public static void testSuitcase(Suitcase mySuitcase, Suitcase yourSuitcase) {
        System.out.println("My suitcase: " + mySuitcase);
        System.out.println("Your suitcase: " + yourSuitcase);

        System.out.println("My suitcase contains the following items: ");
        mySuitcase.printItems();

        System.out.println("Your suitcase contains the following items: ");
        yourSuitcase.printItems();

        System.out.println("Total weight of my suitcase): " + mySuitcase.totalWeight());
        System.out.println("Total weight of your suitcase): " + yourSuitcase.totalWeight());
        System.out.println("Heavitest item in my suitcase: " + mySuitcase.heaviestItem());
        System.out.println("Heavitest item in your suitcase" + yourSuitcase.heaviestItem());

        System.out.println("My suitcase ArrayList: " + mySuitcase.getSuitcase());
        System.out.println("Your suitcase ArrayList: " + yourSuitcase.getSuitcase());
    }

    public static void testHold(Hold cargoHold, Suitcase mySuitcase, Suitcase yourSuitcase) {
        cargoHold.addSuitcase(mySuitcase);
        cargoHold.addSuitcase(yourSuitcase);

        System.out.println(cargoHold);
        cargoHold.printItems();
    }
}
