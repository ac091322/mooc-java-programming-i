
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }

        String longestStr = this.elements.get(0);

        for (int i = 1; i < this.elements.size(); i += 1) {
            String element = this.elements.get(i);

            if (element.length() > longestStr.length()) {
                longestStr = element;
            }
        }

        return longestStr;
    }
}
