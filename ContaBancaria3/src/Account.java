
public class Account {

	private String name;
	private Double balance;
	
	public Account(String name, Double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public void depositAmount(Double depositAmount) {
		if (depositAmount > 0.0)
			balance += depositAmount;
		}
	
	public double getBalance(){
		return balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void accountDisplay() {
		System.out.printf("%s balance: R$ %.2f%n", name, balance);
	}
	
	public void withdraw(Double amount) {
		this.balance -= amount;
	}
}
