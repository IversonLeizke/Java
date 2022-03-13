
public class PayrollSystemTest {

	public static void main(String[] args) 
	{
		SalariedEmployee salariedEmployee = 
				new SalariedEmployee("Jhon", "Smith", "111-11-1111", 800.00);
		HourlyEmployee hourlyEmployee = 
				new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
		CommissionEmployee commissionEmployee = 
				new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, 0.06);
		BasePlusCommisionEmployee basePlusCommissionEmployee = 
				new BasePlusCommisionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
		
		System.out.printf("%n%s%n%s: R$%,.2f%n%n", 
				salariedEmployee, "earned", salariedEmployee.getPaymentAmount());
		System.out.printf("%n%s%n%s: R$%,.2f%n%n", 
				hourlyEmployee, "earned", hourlyEmployee.getPaymentAmount());
		System.out.printf("%n%s%n%s: R$%,.2f%n%n",
				commissionEmployee, "earned", commissionEmployee.getPaymentAmount());
		System.out.printf("%n%s%n%s: R$%,.2f%n%n",
				basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.getPaymentAmount());
		
		Employee[] employees = new Employee[4];
		
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		
		System.out.printf("Employees processed polymorphicallhy: %n%n");
		
		for (Employee currentEmployee : employees)
		{
			System.out.println(currentEmployee);
			
			if (currentEmployee instanceof BasePlusCommisionEmployee)
			{
				BasePlusCommisionEmployee employee =
						(BasePlusCommisionEmployee) currentEmployee;
				
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				
				System.out.printf(
						"new base salary with 10%% increase is: R$%,.2f%n", 
						employee.getBaseSalary());
			}
			
			System.out.printf(
					"earned R$%,.2f%n%n", currentEmployee.getPaymentAmount());
		}
		
		for (int j = 0; j < employees.length; j++)
			System.out.printf("Employee %d is a %s%n", j,
					employees[j].getClass().getName());
	}
}
