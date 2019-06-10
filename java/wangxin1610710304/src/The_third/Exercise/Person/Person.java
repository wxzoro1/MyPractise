package The_third.Exercise.Person;

public class Person {				//¡∑œ∞Ã‚ 10
	String name;
	String age;
	String sex;
	
	public Person(String name,String age,String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	String introduceSelf(){
		System.out.println("I'm "+name+","+age+" years old"+","+sex);
		return " ";
	}
}
