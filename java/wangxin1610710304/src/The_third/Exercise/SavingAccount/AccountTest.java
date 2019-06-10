package The_third.Exercise.SavingAccount;

public class AccountTest {
	
	public static void main(String[]args) {
		SavingAccount saver1 = new SavingAccount();
		SavingAccount saver2 = new SavingAccount();
		saver1.addbalance(2000.0);
		saver2.addbalance(3000.0);
		
		SavingAccount.modifyInterestRate(0.04);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		SavingAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

	}	
}
