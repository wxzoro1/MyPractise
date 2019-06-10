package The_third.Prac_3;
class Parent{
	public int a = 10;
	private int b = 20;
	protected int c = 30;
	public int getB() {
		return b;
	}
	
}
class Child extends Parent{
}

public class Child_Test {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.a);
//		System.out.println(child.b);		//protected
		System.out.println(child.getB());
		System.out.println(child.c);
	}
}

