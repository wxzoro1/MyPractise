package The_third.Prac_3;

public class Dog {											//��������

	public void bark() {
		System.out.println("��������");
	}
	
	public void bark(boolean injured) {
		if (injured) {
			System.out.println("���ʡ���");
		}
	}
	
	public void bark(int mood) {
		if (mood == 0) 
			System.out.println("��������");
		else if(mood == 1)
			System.out.println("����������");
		else if(mood == 2)
			System.out.println("����");
	}
	
	public static void main(String[] args){
		Dog ahuang = new Dog();
		ahuang.bark();
		ahuang.bark(true);
		ahuang.bark(1);
	}
	
}

