package The_third.Exercise.Bank;

public class oneyearNationaldebtAccount extends Bank{
	
	public oneyearNationaldebtAccount(double money) {
		super(money);
	}
	
	void count() {
		deposit =  deposit * (1+oneyearNationale);
	}
	void show() {
		System.out.println("��һ���ڹ�ծ������ʼ����"+deposit);
	}
}
