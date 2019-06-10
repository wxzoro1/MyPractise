package The_third.Exercise.SavingAccount;

public class SavingAccount {						//练习题 6
	public static double annualInterestRate;
	private double savingsBalance = 0;					//注意账户权限，应为Private
	
	void addbalance(double balance) {
		this.savingsBalance = this.savingsBalance + balance; 			//只给用户提供增加权限
	}
	
	void calculateMonthlyInterest(){
		double MonIntere;
		MonIntere = savingsBalance * annualInterestRate /12;
		System.out.println(MonIntere);
	}
	
	static void modifyInterestRate(double n) {
		annualInterestRate = n;
	}

}
