
public class PayableInterfaceTest {

	public static void main(String[] args)
	{
		Payable[] payableObjects = new Payable[4];
		
		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
		payableObjects[2] = new SalariedEmployee("John", "Smith", "11-111-1111", 800.00);
		payableObjects[3] = new BasePlusCommisionEmployee("Lisa", "Barners",
				"22-222-2222", 10000, 0.04, 500.0);
		
		System.out.println("Invoives and employess payments processed polymorphically:");
		
		for (Payable currentPayment : payableObjects)
		{
			System.out.printf("%n%s %n%s: R$%,.2f%n", 
					currentPayment.toString(),
					"payment due", currentPayment.getPaymentAmount());
		}
	}
}
