
public class AccountTest {

	public static void main(String[] Args) {
		Account account1 = new Account("Iverson");
		Account account2 = new Account("Ivo");
		
		System.out.printf("Account number 1 name is %s%n", account1.getName());
		System.out.printf("Account number 2 name is %s%n", account2.getName());
	}
}
