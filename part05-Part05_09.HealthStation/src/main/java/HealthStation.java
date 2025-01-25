
public class HealthStation {

    private int count;

    public HealthStation() {
        this.count = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.count += 1;
        return person.getWeight();
    }

    // this.weight = weight
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return this.count;
    }
}
