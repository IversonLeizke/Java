import java.util.Scanner;

public class Three {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert the temperature in Celsius: ");
        double number = 1.8 * input.nextFloat() + 32;
        System.out.printf("The value converted to fahrenheit is: %.2fº.\n", number);
    }
}
