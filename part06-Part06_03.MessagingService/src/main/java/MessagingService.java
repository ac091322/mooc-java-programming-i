
import java.util.ArrayList;

public class MessagingService {

    private final ArrayList<Message> messageList;

    public MessagingService() {
        this.messageList = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            messageList.add(message);
        } else {
            System.out.println("Message too long");
        }
    }

    public ArrayList<Message> getMessages() {
        return this.messageList;
    }
}
