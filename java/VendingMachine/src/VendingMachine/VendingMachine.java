package VendingMachine;


public class VendingMachine {
	int price = 50;
	int balance=0;
	int total;
	/////////////////////////////////////////////////////////////////////////////////
	VendingMachine()					//���캯�� �����з�������
	{
		total = 0;
	}
	VendingMachine(int price)			//overload ���� ͬ����ͬ����		�൱��setPrice
	{
		this();							//����ȥ�������캯�� �����ǵ�һ�䣬ֻ��һ��
		this.price = price;
	}
	//////////////////////////////////////////////////////////////////////////////////
	void setPrice(int price)			//this. ���󱾵ع��е�ͨ��this�����Լ��ĺ���
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
		showbalance();					//��Ա�����ڲ����ü�this ���߶���. ֱ���޸ļ���
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
