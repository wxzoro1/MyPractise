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
		Human obj = new Boy();	//��������	ȱ�㣺���������ຯ�����¹���	 �ŵ㣺�������ÿ��Լ��ٴ����� �Ż�����
		obj.eat();				//��̬�� (����������д������)
		obj.walk();
//		obj.play();				//Humanû�������Ա����
	}
}
