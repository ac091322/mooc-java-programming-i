
public class Main {

    public static void main(String[] args) {
        Message message1 = new Message("Alan", "Hello, world!");
        Message message2 = new Message("Dylan", "Hello, underworld!");
        Message message3 = new Message("Mikey", "Hello, heaven!");
        Message message4 = new Message("Jake", "Hello, outer space!");

        MessagingService messageService = new MessagingService();

        messageService(messageService, message1);
        messageService(messageService, message2);
        messageService(messageService, message3);
        messageService(messageService, message4);
        getMessages(messageService);
    }

    public static void messageService(MessagingService messageService, Message message) {
        messageService.add(message);
    }

    public static void getMessages(MessagingService messageService) {
        for (Message message : messageService.getMessages()) {
            System.out.println(message);
        }
    }
}
