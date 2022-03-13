
public class TesteBasePlusCommisionEmployee {

	public static void main(String[] args)
	{
		BasePlusComissionEmployee employee = new BasePlusComissionEmployee(
				"Sue", "Jones", "222-22-2222", 10000, .06, 1500.0);
		
		System.out.println(
				"Employee inrformations obtained by get methods:");
		System.out.printf("%n%s %s%n", "First name is:", employee.getFirstName());
		System.out.printf("%s %s%n", "Last name is:", employee.getLastName());
		System.out.printf("%s %s%n", "Social security number is:", employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross Sales is:", employee.getGrossSales());
		System.out.printf("%s %.2f%n", "Comission rate is:", employee.getComissionRate());
		
		employee.setGrossSales(5000);
		employee.setComissionRate(.1);
		
		System.out.printf("%n%s:%n%n%s%n",
				"Update employee information obtained by toString", employee);
		
		System.out.printf("Earnings: %.2f", employee.earnings());
	}
}
