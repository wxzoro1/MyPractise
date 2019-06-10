package The_forth.Prac_4;

class NotEnoughMoney extends Exception{
	public NotEnoughMoney() {
	}
	public NotEnoughMoney(String msg) {
		super(msg);
	}
}
public class GetMoney{
	public static void GetMoney(int money) throws NotEnoughMoney{
		int my_money = 300;
		if( money > my_money)
			throw new NotEnoughMoney();
	}
	
//	public static void BuyStuff() throws NotEnoughMoney{
//	GetMoney(200);
//	System.out.println("买了！");
//	}
	
	public static void BuyStuff() {
		try {
			GetMoney(200);
			System.out.println("买了！");
		} catch (NotEnoughMoney e) {
			System.out.println("异常：钱不够");
		}
	}
	
	public static void main(String[]args) {
		GetMoney getm = new GetMoney();
		getm.BuyStuff();
	}
}



