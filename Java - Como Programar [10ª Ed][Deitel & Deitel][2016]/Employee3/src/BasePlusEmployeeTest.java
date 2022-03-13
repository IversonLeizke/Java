
public class BasePlusEmployeeTest {

	public static void main(String[] args) {
		
		BasePlusComissionEmployee employee = 
				new BasePlusComissionEmployee(
						"Bob", "Lewis", "333-33-3333", 5000, .04, 300);
		
		System.out.println(employee.toString());
	}
}
