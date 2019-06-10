package The_third.Exercise.Bank;

public class oneyearNationaldebtAccount extends Bank{
	
	public oneyearNationaldebtAccount(double money) {
		super(money);
	}
	
	void count() {
		deposit =  deposit * (1+oneyearNationale);
	}
	void show() {
		System.out.println("按一年期国债存款利率计算存款："+deposit);
	}
}
