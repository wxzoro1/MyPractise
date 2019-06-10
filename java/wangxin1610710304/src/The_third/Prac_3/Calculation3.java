package The_third.Prac_3;

public class Calculation3 {					//函数重载 混合类型相同个数
	void sum (int a, double b) {
		System.out.println(a + b);
	}
	
	void sum (double a, int b) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		Calculation3 obj = new Calculation3();
		obj.sum(10, 10.5);
		obj.sum(20.5, 20);
	}
}
