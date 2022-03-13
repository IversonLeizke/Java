
public class BasePlusCommisionEmployee extends CommissionEmployee
{
	private double baseSalary;

	public BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double commissionRate, double baseSalary) 
	{
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		
		if (baseSalary <= 0.0)
			throw new IllegalArgumentException("base salary must be > 0");
		
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() 
	{
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) 
	{
		if (baseSalary <= 0.0)
			throw new IllegalArgumentException("base salary must be > 0.0");
		
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double getPaymentAmount()
	{
		return getBaseSalary() + super.getPaymentAmount();
	}
	
	@Override
	public String toString()
	{
		return String.format("%s: %s; %s: R$%,.2f", 
				"base-salaried", super.toString(),
				"base salary", getBaseSalary());
	}
}
