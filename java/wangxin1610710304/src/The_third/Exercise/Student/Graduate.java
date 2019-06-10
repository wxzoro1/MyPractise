package The_third.Exercise.Student;

public class Graduate extends Student{
	String direction;
	public Graduate(String name,int age,String degree,String direction) {
		super(name, age, degree);
		this.direction = direction;
	}
	
	void show() {
		System.out.println();
		System.out.println("Graduate:");
		super.show();
		System.out.println("Direction:"+direction);	
		System.out.println();
	}
}
