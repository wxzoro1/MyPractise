package The_third.Prac_3;

public class Dog {											//º¯ÊıÖØÔØ

	public void bark() {
		System.out.println("ÍôÍôÍô£¡");
	}
	
	public void bark(boolean injured) {
		if (injured) {
			System.out.println("ÎØÑÊ¡­¡­");
		}
	}
	
	public void bark(int mood) {
		if (mood == 0) 
			System.out.println("ÍôÍôÍô£¡");
		else if(mood == 1)
			System.out.println("Íô£¡ÍôÍô£¡");
		else if(mood == 2)
			System.out.println("ÎØÎØ");
	}
	
	public static void main(String[] args){
		Dog ahuang = new Dog();
		ahuang.bark();
		ahuang.bark(true);
		ahuang.bark(1);
	}
	
}

