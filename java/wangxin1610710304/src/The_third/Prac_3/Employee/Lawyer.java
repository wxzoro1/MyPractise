package The_third.Prac_3.Employee;

public class Lawyer extends Employee{
	public String getVacationForm() {
		return "pink";
	}
	public void sue() {
		System.out.println("·¨Í¥¼û");
	}
	public int getVacationDays() {
		return super.getVacationDays() + 5;
	}
}
