package The_third.Exercise.Bank;

public class oneyearRateAccount extends Bank{

	public oneyearRateAccount(double money) {
		super(money);
	}
	
	void count() {
		deposit =  deposit * (1+oneyearRate);
	}
	void show() {
		System.out.println("��һ���ڶ��ڴ�����ʺ��"+deposit);
	}
}
