package The_third.Prac_3.Animal;

public class Animal3 {						//ฒฮสýปฏ
	public static void MakeSound(AnimalVoice a) {
		a.sound();
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Duck duck = new Duck();
		MakeSound(dog);
		MakeSound(cat);
		MakeSound(duck);
	}
}
