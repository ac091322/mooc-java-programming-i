
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {

    private final String name;
    private final LocalDateTime createdAt;

    public Item(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        return this.name + " (created at: " + formatter.format(this.createdAt) + ")";
    }
}
