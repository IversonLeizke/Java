import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert the temperature in fahrenheit: ");
        double number = (input.nextFloat() - 32) / 1.8;
        System.out.printf("The value converted to Celsius is: %.2fº.\n", number);
    }
}
