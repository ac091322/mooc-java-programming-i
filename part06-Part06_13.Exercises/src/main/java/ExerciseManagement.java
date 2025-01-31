
import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    // return a new list of only exercise names and not the object
    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();

        for (Exercise exercise : exercises) {
            list.add(exercise.getName());
        }
        return list;
    }

    // new exercises are directly created here
    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }

    public void remove(String exercise) {
        exercises.removeIf(ex -> ex.getName().equals(exercise));
    }

    // get the exercise obj from the exercise list
    // get the exercise name from each exercise obj
    // if name matches the input exercise name, set as true
    public void markAsCompleted(String exercise) {
        for (Exercise ex : exercises) {
            if (ex.getName().equals(exercise)) {
                ex.setCompleted(true);
            }
        }
    }

    // get the exercise obj from the exercise list
    // get the exercise name from each exercise obj
    // if the name matches the input exercise name, return true
    // if name does not match, return false
    public boolean isCompleted(String exercise) {
        for (Exercise ex : exercises) {
            if (ex.getName().equals(exercise)) {
                return ex.isCompleted();
            }
        }

        return false;
    }
}
