package The_third.Exercise.Person;

public class Employee extends Person{
	double salary;
	public Employee(String name,String age,String sex, double salary) {
		super(name, age, sex);
		this.salary = salary;
	}
	
	String introduceSelf(){
		super.introduceSelf();
		System.out.println("I'm Employee and my salary is "+salary);
		return " ";
	}
	
}
