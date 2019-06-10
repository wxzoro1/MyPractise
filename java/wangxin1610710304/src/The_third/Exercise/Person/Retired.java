package The_third.Exercise.Person;

public class Retired extends Person{
	String hobby;
	public Retired(String name,String age,String sex,String hobby) {
		super(name, age, sex);
		this.hobby = hobby;
	}
	
	String introduceSelf(){
		super.introduceSelf();
		System.out.println("I'm retired and My hobby is "+hobby);
		return " ";
	}
}
