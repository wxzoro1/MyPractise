package VendingMachine;


public class VendingMachine {
	int price = 50;
	int balance=0;
	int total;
	/////////////////////////////////////////////////////////////////////////////////
	VendingMachine()					//构造函数 不能有返回类型
	{
		total = 0;
	}
	VendingMachine(int price)			//overload 重载 同名不同参数		相当于setPrice
	{
		this();							//可以去其他构造函数 必须是第一句，只有一次
		this.price = price;
	}
	//////////////////////////////////////////////////////////////////////////////////
	void setPrice(int price)			//this. 对象本地固有的通过this调用自己的函数
	{
		this.price = price;
	}
	void showPramet()
	{
		System.out.println("You are welcome");
	}
	void insertMoney(int acount)
	{
		balance += acount;
		showbalance();					//成员函数内部不用加this 或者对象. 直接修改即可
	}
	void showbalance()
	{
		System.out.println(balance);
	}
	void getfood()
	{
		if(balance>price)
		{
		System.out.println("Here you are");
		balance -= price;
		total   += price;
		}
	}
	//////////////////////////////////////////////////////////////////////////////////
		public static void main(String[] args) {
			VendingMachine v = new VendingMachine();
			v.showPramet();
			v.showbalance();
			v.insertMoney(100);
			v.getfood();
			v.showbalance();	
	}
	///////////////////////////////////////////////////////////////////////////////////
}
