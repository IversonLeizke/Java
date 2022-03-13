import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling 
{

	public static int quotient(int numerator, int denominator)
		throws ArithmeticException
	{
		return numerator / denominator;
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		boolean continueLoop = true;
		
		do
		{
			try
			{
				System.out.print("Please enter an integer numerator: ");
				int numerator = scanner.nextInt();
				System.out.print("Please enter an integer denominator: ");
				int denominator = scanner.nextInt();
				
				int result = quotient(numerator, denominator);
				System.out.printf("%nResult: %d / %d = %d", numerator, denominator, result);
				continueLoop = false;
			}
			catch (InputMismatchException a)
			{
				System.err.printf("%nException: %s%n", a);
				scanner.nextLine();
				System.out.printf("You must enter intergers, please try again%n%n");
			}
			catch (ArithmeticException b)
			{
				System.err.printf("%nException: %s%n", b);
				System.out.printf("Zero is an invalid denominator%n%n");
			}
		} while (continueLoop);
	}
}
