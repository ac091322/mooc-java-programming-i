
public class Sandbox {

    public static void main(String[] args) {
        System.out.println("Test, test.");
        
        int age = 32;
        int height = 178;
        height = age + 10;
        System.out.println(age);
        
        System.out.println(2_147_483_647 * 1);
        System.out.println(2_147_483_647 * 1 + 1);
        System.out.println((long) 2_147_483_647 * 1 + 1);
        System.out.println((long) 2_147_483_647 * 2);
       
        int dividend = 3;
        int divisor = 2;
        double result1 = (double) dividend / divisor;
        double result2 = dividend / (double) divisor;
        double result3 = dividend / divisor * 1.0;
        double result4 = 1.0 * dividend / divisor;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
