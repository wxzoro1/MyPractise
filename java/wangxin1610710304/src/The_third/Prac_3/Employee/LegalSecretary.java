package The_third.Prac_3.Employee;

public class LegalSecretary extends Secretary{
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + 5000;
	}
	
	public void fileLegalBriefs() {
		System.out.println("°ÑËßËÏ°¸¹éµµ");
	}
}
