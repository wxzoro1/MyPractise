package The_third.Prac_3;
class Human{
	public void eat() {
		System.out.println("Human is eating");
	}
	public void walk() {
		System.out.println("Human is walking");
	}
}
public class Boy extends Human{

	public void eat() {
		System.out.println("Boy is eating");
	}

	public void play() {
		System.out.println("Boy is playing");
	}
	
	public static void main(String[]args) {
		Human obj = new Boy();	//向上造型	缺点：丢弃了子类函数的新功能	 优点：合理运用可以减少代码量 优化代码
		obj.eat();				//动态绑定 (跳到子类重写函数中)
		obj.walk();
//		obj.play();				//Human没有这个成员函数
	}
}
