
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        PaymentCard petesCard = new PaymentCard(10);
        PaymentCard annsCard = new PaymentCard(7);
        PaymentCard alansCard = new PaymentCard(2);

        PaymentTerminal unicafeExactum = new PaymentTerminal();

        testPaymentCard(petesCard);
        testPaymentTerminalCash(unicafeExactum);
        testPaymentTerminalCard(unicafeExactum, annsCard);
        testPaymentTerminalAdd(unicafeExactum, alansCard);
    }

    public static void testPaymentCard(PaymentCard card) {
        System.out.println("balance: " + card.balance());
        boolean wasSuccessful = card.takeMoney(8);
        System.out.println("Successfully withdrew: " + wasSuccessful);
        System.out.println("balance: " + card.balance());

        wasSuccessful = card.takeMoney(4);
        System.out.println("Successfully withdrew: " + wasSuccessful);
        System.out.println("balance: " + card.balance());
    }

    public static void testPaymentTerminalCash(PaymentTerminal terminal) {
        double change = terminal.eatAffordably(10);
        System.out.println("Remaining change: " + change);

        change = terminal.eatAffordably(5);
        System.out.println("Remaining change: " + change);

        change = terminal.eatHeartily(4.3);
        System.out.println("Remaining change: " + change);

        System.out.println(terminal);
    }

    public static void testPaymentTerminalCard(PaymentTerminal terminal, PaymentCard card) {
        double change = terminal.eatAffordably(10);
        System.out.println("Remaining change: " + change);

        boolean wasSuccessful = terminal.eatHeartily(card);
        System.out.println("There was enough money: " + wasSuccessful);
        wasSuccessful = terminal.eatHeartily(card);
        System.out.println("There was enough money: " + wasSuccessful);
        wasSuccessful = terminal.eatAffordably(card);
        System.out.println("There was enough money: " + wasSuccessful);

        System.out.println(terminal);
    }

    public static void testPaymentTerminalAdd(PaymentTerminal terminal, PaymentCard card) {
        System.out.println("Amount of money on the card is: " + card.balance() + " euros");

        boolean wasSuccessful = terminal.eatHeartily(card);
        System.out.println("There was enough money: " + wasSuccessful);

        terminal.addMoneyToCard(card, 100);
        wasSuccessful = terminal.eatHeartily(card);
        System.out.println("There was enough money: " + wasSuccessful);

        System.out.println("Amount of money on the card is: " + card.balance() + " euros");

        System.out.println(terminal);
    }
}
