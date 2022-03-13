import java.util.Scanner;

public class Soma {
	
	public static void main(String[] Args) {
		
		Scanner input = new Scanner(System.in);
		
		int number1, number2, sum;
		
		System.out.print("Insert the first integer: ");
		number1 = input.nextInt();
		System.out.print("Insert the second integer: ");
		number2 = input.nextInt();
		sum = number1 + number2;
		
		System.out.printf("Sum is %d%n", sum);
		
	}
}
