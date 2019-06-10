package The_third.Prac_3;

public class BankAccount {
	private String number;
	private double balance;
	private String password;
	
	public void deposit(double money) {
		balance += money;
	}
	public void withdraw(double money) {
		balance -= money;
	}
	public void setPassword(String pwd) {
		password = pwd;
	}
	public void resetPassword(String pwd) {
		password = pwd;
	}
	public static void main(String[] args) {
		BankAccount myself = new BankAccount();
		myself.balance = 123123;
		myself.deposit(100);
		myself.withdraw(20);
		System.out.println(myself.balance);
		myself.setPassword("123112asd");
		System.out.println(myself.password);	
	}
}
class Badman{
	public static void main(String[] args) {
	BankAccount himself = new BankAccount();
	himself.deposit(10123);
	System.out.println(himself); 				//起到了封装作用
	}
}