
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        todoList.add("read the course material");
        todoList.add("watch the latest fool us");
        todoList.add("take it easy");

        todoList.print();
        todoList.remove(2);
        System.out.println();
        todoList.print();
        System.out.println();

        UserInterface ui = new UserInterface(todoList, scanner);
        ui.start();
    }
}
