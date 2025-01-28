
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (!(meals.contains(meal))) {
            meals.add(meal);
        } else {
            System.out.println("Already in menu");
        }
    }

    public void printMeals() {
        int index = 0;
        while (index < meals.size()) {
            System.out.println(this.meals.get(index));
            index += 1;
        }
    }

    public void clearMenu() {
        meals.clear();
    }
}
