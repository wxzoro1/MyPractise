package The_third.Exercise.Bank;

public class interestAccount extends Bank{
	
	public interestAccount(double money) {
		super(money);
	}
	
	void count() {
		deposit =  deposit * (1+interestRate);
	}
	void show() {
		System.out.println("��һ���ڻ��ڴ�����ʼ����"+deposit);
	}
}
