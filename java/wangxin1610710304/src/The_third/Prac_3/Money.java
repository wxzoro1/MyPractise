package The_third.Prac_3;


public class Money {
	Dollar d = new Dollar();								//second step
	public Money() {
		System.out.println("All money come to my home");	//final step
	}
	public static void main(String[]args) {
		Money m = new Money();								// first step
	}
}

class Dollar{												
	int n = 100;
	public Dollar() {										// third step
		System.out.println(n + " dollars come to my home");
	}
}
