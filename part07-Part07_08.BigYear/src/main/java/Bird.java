
public class Bird {

    private final String name;
    private final String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public void addObservation() {
        this.observations += 1;
    }

    @Override
    public String toString() {
        String observationText = this.observations == 1 ? "observation" : "observations";
        return String.format("%s (%s): %d %s", this.name, this.latinName, this.observations, observationText);
    }
}
