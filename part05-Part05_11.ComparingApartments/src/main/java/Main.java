
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);
        Apartment testApt1 = new Apartment(1, 20, 1000);
        Apartment testApt2 = new Apartment(2, 30, 2000);

        System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));
        System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));

        System.out.println("manhattanStudioApt total price: " + manhattanStudioApt.getTotalPrice());
        System.out.println("atlantaTwoBedroomApt total price: " + atlantaTwoBedroomApt.getTotalPrice());
        System.out.println("bangorThreeBedroomApt total price: " + bangorThreeBedroomApt.getTotalPrice());
        System.out.println("testApt1 total price: " + testApt1.getTotalPrice());
        System.out.println("testApt2 total price: " + testApt2.getTotalPrice());

        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));
        System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));
        System.out.println(testApt1.priceDifference(testApt2));

        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));
        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));
    }
}
