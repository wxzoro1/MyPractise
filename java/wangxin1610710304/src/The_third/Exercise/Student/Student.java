package The_third.Exercise.Student;

public class Student {				//¡∑œ∞Ã‚ 7
	private String name;
	private int age;
	private String degree;
	
	public Student(String name,int age,String degree){
		super();
		this.name = name;
		this.age = age;
		this.degree = degree;
	}
	
	void show(){
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Degree:"+degree);
	}
}

