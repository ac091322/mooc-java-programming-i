
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> room;

    public Room() {
        this.room = new ArrayList<>();
    }

    public void add(Person person) {
        room.add(person);
    }

    public boolean isEmpty() {
        return this.room.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.room;
    }

    public Person shortest() {
        if (this.room.isEmpty()) {
            return null;
        }

        // Person shortestPerson = room.get(0);
        int shortestHeight = Integer.MAX_VALUE;
        Person shortestPerson = null;

        int i = 0;
        while (i < room.size()) {
            Person person = room.get(i);
            if (person.getHeight() < shortestHeight) {
                shortestHeight = person.getHeight();
                shortestPerson = person;
            }

            i += 1;
        }

        return shortestPerson;
    }

    public Person take() {
        if (this.room.isEmpty()) {
            return null;
        }

        // do not use this.room.shortest() because this.room is an ArrayList
        // directly call shortest() on the Room class
        Person shortestPerson = shortest();
        this.room.remove(shortestPerson);
        return shortestPerson;
    }
}
