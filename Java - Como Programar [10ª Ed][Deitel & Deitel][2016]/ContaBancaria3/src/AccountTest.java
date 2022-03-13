import javax.swing.JOptionPane;

public class AccountTest 
{

	public static void main(String[] args)
	{
		
		String name = JOptionPane.showInputDialog(null,"Please insert the name for the account: ");
		String message = String.format("Dear Mr. %s insert the deposit amount:", name);
		Double amount = Double.parseDouble(JOptionPane.showInputDialog(null, message));
		Account account1 = new Account(name, amount);
		amount = Double.parseDouble(JOptionPane.showInputDialog
				(null, "Please enter the amount that you'd like to withdraw."));
		account1.withdraw(amount);
		
		
		account1.accountDisplay();
	}
}
