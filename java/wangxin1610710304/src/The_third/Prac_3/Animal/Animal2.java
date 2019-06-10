package The_third.Prac_3.Animal;

public class Animal2 {							//批量化
	public static void main(String[] args) {
		AnimalVoice[] theAnimals = new AnimalVoice[3];
		theAnimals[0] = new Dog();				//向上造型
		theAnimals[1] = new Cat();
		theAnimals[2] = new Duck();
		for (int i = 0; i < 3 ; i++) {
			theAnimals[i].sound();
		}
	}
}
