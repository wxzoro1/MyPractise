package The_third.Prac_3;


public class NCounter {
	
	int myCounter = 0;
	static int ourCount = 0;
	
	void increment() {
		myCounter ++;
		ourCount ++;
	}
	public static void main(String[] args) {
		NCounter counter1 = new NCounter();
		NCounter counter2 = new NCounter();
		counter1.increment();
		counter1.increment();
		counter2.increment();
		System.out.println(counter1.myCounter);
		System.out.println(counter2.myCounter);
		System.out.println(ourCount);
		
	}

}
