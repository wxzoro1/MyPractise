package The_third.Exercise;
import java.util.HashMap;

public class Date {								//练习题 3
	int year;
	int month;
	int day;
	Date(int year,int month, int day){
		if(month<10) {
			if(day<10) { 
				System.out.println("0"+day+"/"+"0"+month+"/"+year);}
			else if (day>9) {
				System.out.println(day+"/"+"0"+month+"/"+year);}
		}
		else {
			if(day<10) { 
				System.out.println("0"+day+"/"+month+"/"+year);}
			else if (day>9) {
				System.out.println(day+"/"+month+"/"+year);}
			}
		}
	public static void main(String[]args) {
		Date d1 = new Date(1997, 2, 11);
		System.out.println("--------------------------------------");
		Date d2 = new Date2(1997, 9, 24);
		System.out.println("--------------------------------------");
		Date d3 = new Date3(1997, 2, 11);
	}
}
class Date2 extends Date{
	private HashMap<Integer, String> MonthName = new HashMap<Integer, String>();
	Date2(int year, int month, int day) {
		super(year, month, day);
		String[] Month= {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		for(int i = 0; i < 12; i++) {
			MonthName.put((i+1), Month[i]);
		}
		if(day < 10) {
			System.out.println(MonthName.get(month)+" "+"0"+day+","+year);
		}
		else {
			System.out.println(MonthName.get(month)+" "+day+","+year);
		}
	}
}

class Date3 extends Date{
	Date3(int year, int month, int day){
		super(year, month, day);
		System.out.println(year+"年"+month+"月"+day+"日");
	}
}
	

