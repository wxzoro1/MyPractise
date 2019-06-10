package The_third.Prac_3;

public class Calculation {						//函数重载 同类型不同个数
	void sum(int a, int b) {
		System.out.println(a + b);
	}
	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	public static void main(String[] args) {
		Calculation obj = new Calculation();
		obj.sum(10, 10, 10);
		obj.sum(20, 20);
	}

}
