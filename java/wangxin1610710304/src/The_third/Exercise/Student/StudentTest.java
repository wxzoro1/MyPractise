package The_third.Exercise.Student;

public class StudentTest {
	public static void main(String[]args) {
		Student s1 = new Student("Alice",18,"Grade 3");
		Undergraduate s2 = new Undergraduate("Grace", 19, "Grade 4", "Management");
		Graduate s3 = new Graduate("Tim", 23 ,"Graduated", "Music");
		
		s1.show();
		s2.show();
		s3.show();
	}
}
