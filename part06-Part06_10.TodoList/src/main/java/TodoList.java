
import java.util.ArrayList;

public class TodoList {

    private final ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String task) {
        this.todoList.add(task);
    }

    public void print() {
        // a forEach loop here is not consistent (should use traditional for loop instead)
        for (int i = 0; i < todoList.size(); i += 1) {
            String task = this.todoList.get(i);
            System.out.println((i + 1) + ": " + task);
        }
    }

    public void remove(int number) {
        int index = number - 1;

        if (index >= 0 && index < todoList.size()) {
            this.todoList.remove(index);
        }
    }
}
