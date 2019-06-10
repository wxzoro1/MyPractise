package The_third.Exercise.Person;

public class Student extends Person{
	String major;
	public Student(String name,String age,String sex, String major) {
		super(name, age, sex);
		this.major = major;
	}
	
	String introduceSelf(){
		super.introduceSelf();
		System.out.println("I'm a Student major in "+major);
		return " ";
	}
	
}
