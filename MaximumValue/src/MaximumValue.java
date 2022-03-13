import java.util.Scanner;

public class MaximumValue {

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		double result = maximumValue(number1, number2, number3);
		
		System.out.println("The maximum value is: " + result);
	}
	
	public static double maximumValue(double x, double y, double z)
	{
		double maximumValue = x;
		
		if (maximumValue < y)
			maximumValue = y;
		
		if (maximumValue < z)
			maximumValue = z;
		
		return maximumValue;
	}
}
