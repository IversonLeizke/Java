import java.util.Scanner;

public class AccountTest {

	public static void main(String[] Args) {
		
		Scanner input = new Scanner(System.in);
		
		Account myAccount = new Account();
		
		System.out.printf("Initial name is: %s%n%n", myAccount.getName());
		
		System.out.println("Please enter the name: ");
		myAccount.setName(input.nextLine());
		System.out.println();
		
		System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());
		
	}
	
}
