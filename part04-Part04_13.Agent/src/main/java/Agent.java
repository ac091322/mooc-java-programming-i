
public class Agent {

    private final String firstName;
    private final String lastName;

    public Agent(String initFirstName, String initLastName) {
        this.firstName = initFirstName;
        this.lastName = initLastName;
    }

    // public void print() {
    // System.out.println("My name is " + this.lastName + ", " + this.firstName + " " + this.lastName);
    // }
    // this method must be called "toString()"
    @Override
    public String toString() {
        return String.format("My name is %s, %s %s", this.lastName, this.firstName, this.lastName);
    }
}
