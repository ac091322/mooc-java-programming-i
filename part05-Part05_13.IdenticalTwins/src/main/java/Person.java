
import java.util.Objects;

public class Person {

    private final String name;
    private final SimpleDate birthday;
    private final int height;
    private final int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person comparedPerson = (Person) compared;
        return this.name.equals(comparedPerson.name)
                && this.birthday.equals(comparedPerson.birthday)
                && this.height == comparedPerson.height
                && this.weight == comparedPerson.weight;
    }

    // only relevant for hash-based collections like HashMap, HashSet, or HashTabl
    @Override
    public int hashCode() {
        return Objects.hash(name, birthday, height, weight);
    }
}
