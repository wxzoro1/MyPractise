package The_third.Prac_3;

public class Calculation2 {									//函数重载 不同类型(也有混合不同类型)相同个数
	void sum (int a, int b) {
		System.out.println(a + b);
	}
	void sum (double a, double b) {
		System.out.println(a + b);
	}
	public static void main(String[] args) {
		Calculation2 obj = new Calculation2();
		obj.sum(10.5, 10.5);
		obj.sum(20, 20);
	}

}
