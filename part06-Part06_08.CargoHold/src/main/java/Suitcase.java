
import java.util.ArrayList;

public class Suitcase {

    private final int maxWeight;
    private final ArrayList<Item> suitcase;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcase = new ArrayList<>();
    }

    public void addItem(Item item) {

        if (this.totalWeight() + item.getWeight() <= maxWeight) {
            this.suitcase.add(item);
        } else {
            System.out.println("Suitcase at max capactiy");
        }
    }

    public ArrayList<Item> getSuitcase() {
        return this.suitcase;
    }

    public void printItems() {
        this.suitcase.forEach(item -> System.out.println(item));
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item item : suitcase) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public Item heaviestItem() {
        if (this.suitcase.isEmpty()) {
            return null;
        }

        Item heaviestItem = this.suitcase.get(0);

        int i = 0;
        while (i < this.suitcase.size()) {
            Item item = this.suitcase.get(i);
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
            i += 1;
        }

        return heaviestItem;
    }

    @Override
    public String toString() {
        if (suitcase.isEmpty()) {
            return "no items (0 kg)";
        }

        int numberOfItems = suitcase.size();
        int totalWeight = totalWeight();

        String itemTxt = numberOfItems != 1 ? "items" : "item";
        return String.format("%d %s (%d kg)", numberOfItems, itemTxt, totalWeight);
    }
}
