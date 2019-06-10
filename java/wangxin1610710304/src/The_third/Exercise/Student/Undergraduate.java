package The_third.Exercise.Student;

public class Undergraduate extends Student{
	String specialty;
	
	public Undergraduate(String name,int age,String degree,String specialty) {
		super(name, age, degree);
		this.specialty = specialty;
	}
	void show() {
		System.out.println();
		System.out.println("Undergraduate:");
		super.show();
		System.out.println("Specialty:");
		System.out.println();
	}
}
