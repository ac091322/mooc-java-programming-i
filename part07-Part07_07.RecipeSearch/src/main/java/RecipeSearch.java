
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String filename = scanner.nextLine();
        ArrayList<Recipe> recipes = readFromFile(filename);

        System.out.println("");

        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient\n");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                recipes.forEach(recipe -> System.out.println(recipe));
                System.out.println("");
            }

            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchedWord = scanner.nextLine();

                System.out.println(searchRecipes(recipes, searchedWord));
                System.out.println("");
            }

            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookTime = Integer.valueOf(scanner.nextLine());

                System.out.println(searchMaxCookTime(recipes, maxCookTime));
                System.out.println("");
            }

            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();

                System.out.println(searchIngredient(recipes, ingredient));
                System.out.println("");
            }
        }
    }

    public static ArrayList<Recipe> readFromFile(String filename) {
        ArrayList<Recipe> recipes = new ArrayList<>();

        try ( Scanner reader = new Scanner(Paths.get(filename))) {

            while (reader.hasNextLine()) {
                String name = reader.nextLine();
                int time = Integer.parseInt(reader.nextLine());

                ArrayList<String> ingredients = new ArrayList<>();

                while (reader.hasNextLine()) {
                    String ingredient = reader.nextLine();

                    if (ingredient.isEmpty()) {
                        break;
                    }

                    ingredients.add(ingredient);
                }

                recipes.add(new Recipe(name, time, ingredients));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return recipes;
    }

    public static ArrayList<Recipe> searchRecipes(ArrayList<Recipe> recipes, String searchedWord) {
        ArrayList<Recipe> foundRecipes = new ArrayList<>();

        for (Recipe recipe : recipes) {
            if (recipe.getName().toLowerCase().contains(searchedWord.toLowerCase())) {
                foundRecipes.add(recipe);
            }
        }

        return foundRecipes;
    }

    public static ArrayList<Recipe> searchMaxCookTime(ArrayList<Recipe> recipes, int maxCookTime) {
        ArrayList<Recipe> foundRecipes = new ArrayList<>();

        for (Recipe recipe : recipes) {
            if (recipe.getTime() <= maxCookTime) {
                foundRecipes.add(recipe);
            }
        }

        return foundRecipes;
    }

    public static ArrayList<Recipe> searchIngredient(ArrayList<Recipe> recipes, String ingredient) {
        ArrayList<Recipe> foundRecipes = new ArrayList<>();

        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                foundRecipes.add(recipe);
            }
        }

        return foundRecipes;
    }
}
