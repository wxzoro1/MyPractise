package The_third.Prac_3;


public class Parameter {							//实参到形参数据传递是单向值传递

	public static void main(String[] args) {
		int a, b ;
		a = 2; b =3;
		func(a, b);
		System.out.println("3"+" "+a +" "+ b);	
	}
	static void func (int x, int y) {
		System.out.println("1"+" "+x+" "+y);
		x = 10;
		y = 15;
		System.out.println("2"+" "+x+" "+ y);
		}
}
