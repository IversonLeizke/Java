
public class ComissionEmployee extends Object
{
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;
	
	public ComissionEmployee(String firstName, String lastName,
			String socialSecurityNumber, double grossSales, double commissionRate)
	{
		if (grossSales <= 0.0)
			throw new IllegalArgumentException(
					"Gross sales must be > 0.0");
		
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
					"Comission rate must be > 0.0 and < 0.0");
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.commissionRate = commissionRate;
		this.grossSales = grossSales;		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	public void setGrossSales(double grossSales) {
		if (grossSales <= 0.0)
			throw new IllegalArgumentException(
			"Gross sales must be > 0.0");
			
			this.grossSales = grossSales;
	}
	
	public void setComissionRate(double comissionRate) {
		if (comissionRate <= 0.0 || comissionRate >= 1.0)
			throw new IllegalArgumentException(
					"Comission rate must be > 0.0 and < 1.0");
			
			this.commissionRate = comissionRate;
	}
	
	public double getGrossSales() {
		return grossSales;
	}
	
	public double getComissionRate() {
		return commissionRate;
	}
	
	public double earnings()
	{
		return commissionRate * grossSales;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
				"comission eployee", firstName, lastName,
				"social security number", socialSecurityNumber,
				"gross Sales", grossSales,
				"comission rate", commissionRate);
	}

}
