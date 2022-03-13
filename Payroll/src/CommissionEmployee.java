
public class CommissionEmployee extends Employee
{
	public double grossSales;
	public double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double grossSales, double commissionRate) 
	{
		super(firstName, lastName, socialSecurityNumber);
		
		if (grossSales <= 0.0)
			throw new IllegalArgumentException("gross sales must be > 0.0");
		
		if (commissionRate <= 0.0 || commissionRate > 1.0)
			throw new IllegalArgumentException("commision rate must be > 0.0 and < 1.0");
		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() 
	{
		return grossSales;
	}

	public void setGrossSales(double grossSales) 
	{
		if (grossSales <= 0.0)
			throw new IllegalArgumentException("gross sales must be > 0.0");
		
		this.grossSales = grossSales;
	}

	public double getCommissionRate() 
	{
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) 
	{
		if (commissionRate <= 0.0 || commissionRate > 1.0)
			throw new IllegalArgumentException("commision rate must be > 0.0 and < 1.0");
		
		this.commissionRate = commissionRate;
	}
	
	@Override
	public double getPaymentAmount()
	{
		return commissionRate * grossSales;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s: %s%n%s: R$%,.2f; %s: %.2f", 
				"commision employee",super.toString(),
				"gross sales", getGrossSales(),
				"commision rate", getCommissionRate());
	}
}
