
import java.util.ArrayList;

public class Hold {

    private int currentWeight = 0;
    private final int maxWeight;
    private ArrayList<Suitcase> cargoHold;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.cargoHold = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (currentWeight + suitcase.totalWeight() <= maxWeight) {
            currentWeight += suitcase.totalWeight();
            cargoHold.add(suitcase);
        } else {
            System.out.println("Hold at capacity");
        }
    }

    public void printItems() {
        System.out.println("The suitcases in the hold contain the following items:");

        // for (Suitcase suitcase : cargoHold) {
        // for (Item item : suitcase.getSuitcase()) {
        // System.out.println(item);
        // }
        // }
        int index = 0;
        while (index < this.cargoHold.size()) {
            this.cargoHold.get(index).printItems();
            index += 1;
        }
    }

    @Override
    public String toString() {
        String suitcaseTxt = cargoHold.size() != 1 ? "suitcases" : "suitcase";
        return String.format("%d %s (%d kg)", cargoHold.size(), suitcaseTxt, this.currentWeight);
    }
}
