package The_third.Exercise.SavingAccount;

public class SavingAccount {						//��ϰ�� 6
	public static double annualInterestRate;
	private double savingsBalance = 0;					//ע���˻�Ȩ�ޣ�ӦΪPrivate
	
	void addbalance(double balance) {
		this.savingsBalance = this.savingsBalance + balance; 			//ֻ���û��ṩ����Ȩ��
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
