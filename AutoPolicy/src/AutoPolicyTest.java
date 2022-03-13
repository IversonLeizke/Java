
public class AutoPolicyTest {

	public static void main(String[] Args) {
		
		AutoPolicy policy1 = new AutoPolicy(11111, "Onix", "NY");
		AutoPolicy policy2 = new AutoPolicy(22222, "Palio", "ME");
		
		policyInFaultState(policy1);
		policyInFaultState(policy2);
	}
	
	public static void policyInFaultState(AutoPolicy policy	) 
	{
		System.out.println("The auto policy: ");
		System.out.printf("Account #: %d; Car %s; State %s %s a no-fault state%n%n",
				policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(), 
				(policy.isNoFaultState() ? "is" : "is not"));
	}
}
