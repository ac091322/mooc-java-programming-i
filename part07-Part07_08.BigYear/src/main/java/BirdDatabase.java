
import java.util.ArrayList;

public class BirdDatabase {

    private ArrayList<Bird> birds;

    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }

    public void addBird(Bird bird) {
        birds.add(bird);
    }

    public void observation(String birdName) {
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(birdName)) {
                bird.addObservation();
            }
        }
    }

    public Bird getBird(String birdName) {
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(birdName)) {
                return bird;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Bird bird : birds) {
            sb.append(bird.toString()).append("\n");
        }

        return sb.toString();
    }
}
