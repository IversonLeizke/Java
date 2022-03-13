
public class employeeTest {

	public static void main(String[] args)
	{
		Date birth = new Date( 17, 11, 1989);
		Date hire = new Date( 5, 8, 2019);
		Employee employee = new Employee("Leitzke", "Iverson", birth, hire);
		
		System.out.println(employee);
	}
}
