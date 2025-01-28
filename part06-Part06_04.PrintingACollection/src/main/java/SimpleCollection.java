
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

    public String getName() {
        return this.name;
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        StringBuilder string = new StringBuilder();
        for (String element : elements) {
            if (this.elements.size() == 1) {
                string.append(element);
            } else {
                string.append(element).append("\n");
            }
        }

        // String newString = "";
        // for (String element : elements) {
        // newString += "\n" + element;
        // }
        String elementTxt = "elements";
        if (this.elements.size() == 1) {
            elementTxt = "element";
        }

        return String.format("The collection %s has %d %s:\n%s", this.name, this.elements.size(), elementTxt, string);
    }
}
