package The_third.Prac_3.Animal;

class Foo{
	void method() {
	}
}

class Bar extends Foo{
	void method() {	
	}
}

abstract class AnimalVoice{
	public abstract void sound();		//������Զ����Ҫ���õĸ��ຯ�� ʹ��abstract���ṩ�����༴�� ֻ����д����ԭ�Ͳ���д����ĺ���
}

class Dog extends AnimalVoice {			//��д
	public void sound() {
		System.out.println("����");
	}
}
	
class Cat extends AnimalVoice {
	public void sound() {
		System.out.println("����");
	}
}
	
class Duck extends AnimalVoice {
	public void sound() {
		System.out.println("����");
	}
}
	
public class Animal{
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Duck duck = new Duck();
		dog.sound();
		cat.sound();
		duck.sound();
	}
}

