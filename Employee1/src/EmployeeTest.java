
public class EmployeeTest {

	public static void main(String[] args)
	{
		System.out.printf("Employees before instantiation: %d%n", Employee.getCount());
		
		Employee e1 = new Employee("Susan", "Baker");
		Employee e2 = new Employee("Bob", "Blue");
		
		System.out.printf("Employees aftes instatiation: %d%n", Employee.getCount());
	}
}
