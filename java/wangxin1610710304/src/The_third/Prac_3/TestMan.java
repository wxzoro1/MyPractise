package The_third.Prac_3;

public class TestMan {
	public static void main(String[] args) {
		IronMan im = new IronMan();
		im.nickname = "������";
		Man m = im;
		m.name = "Tony Stark";
		im.print();
	}
}

class Man{
	String name;
}
class IronMan extends Man{
	String nickname;
	void print() {
		System.out.println("Man:" + name);
		System.out.println("Ironman:" + nickname);
	}
}