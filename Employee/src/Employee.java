
public class Employee {

	private String firstName;
	private String lastName;
	private Date birthdate;
	private Date hireDate;
	
	public Employee(String firstName, String lastName, Date birthDate, Date hireDate)
	{
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.birthdate = birthDate;
		 this.hireDate = hireDate;
	}
	
	public String toString()
	{
		return String.format("%s, %s Hired: %s, BirthDay %s",
				lastName, firstName, hireDate, birthdate);
	}
}
