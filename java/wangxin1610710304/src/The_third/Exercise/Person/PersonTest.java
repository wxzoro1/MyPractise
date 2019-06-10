package The_third.Exercise.Person;

public class PersonTest {
	public static void main(String[] args) {
		String[][] dict = {{"����","19","��"},{"����","8","��"},{"С��","17","Ů"},{"����","76","��"}};
		//��������
		Student n1 = new Student("SARA", "12", "GIRL", "Dance");
		n1.introduceSelf();
		System.out.println("----------------------------------------------");
		//������
		Person[] thPersons = new Person[4];
		thPersons[0] = new Person(dict[0][0], dict[0][1], dict[0][2]);
		thPersons[1] = new Employee(dict[1][0], dict[1][1], dict[1][2], 3600);
		thPersons[2] = new Student(dict[2][0], dict[2][1], dict[2][2], "Management");
		thPersons[3] = new Retired(dict[3][0], dict[3][1], dict[3][2], "����");
		for(int i = 0; i < 4; i++) {
			thPersons[i].introduceSelf();
		}
		System.out.println("----------------------------------------------");
		//������
		Student student = new Student(dict[2][0], dict[2][1], dict[2][2], "Management");
		Employee employee = new Employee(dict[1][0], dict[1][1], dict[1][2], 3600);
		Retired retired = new Retired(dict[3][0], dict[3][1], dict[3][2], "����");
		Intro(student);
		Intro(employee);
		Intro(retired);
	}
	public static void Intro(Person a) {
		a.introduceSelf();
	}
}
