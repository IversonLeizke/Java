
public class BasePlusComissionEmployee extends ComissionEmployee 
{
	private double baseSalary;
	
	public BasePlusComissionEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary)
	{
		super(firstName, lastName, socialSecurityNumber, grossSales,
				commissionRate);
		
		if (baseSalary <= 0.0)
			throw new IllegalArgumentException("base salary must be > 0.0");
		
		this.baseSalary = baseSalary;
	}
	
	public void setBaseSalary(double baseSalary)
	{
		this.baseSalary = baseSalary;
	}
	
	public double getBaseSalary() 
	{
		return baseSalary;
	}
	
	@Override
	public double earnings()
	{
		return baseSalary + super.earnings();
	}
	
	@Override
	public String toString()
	{
		return String.format("%s%n%s: %.2f", super.toString(), "base salary", baseSalary);
	}
}
