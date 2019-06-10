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
	public abstract void sound();		//对于永远不需要调用的父类函数 使用abstract仅提供抽象类即可 只可以写函数原型不可写具体的函数
}

class Dog extends AnimalVoice {			//重写
	public void sound() {
		System.out.println("汪汪");
	}
}
	
class Cat extends AnimalVoice {
	public void sound() {
		System.out.println("喵喵");
	}
}
	
class Duck extends AnimalVoice {
	public void sound() {
		System.out.println("呱呱");
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

