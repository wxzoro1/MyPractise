package The_third.Prac_3;

public class Baby {
	String name;
	double weight;
	boolean isMale;
	int age = 0;
	int numPoops = 0;
	Baby[] sibings;
	
	Baby (String myname, double myweight, boolean male){
		name = myname;
		weight = myweight;
		isMale = male;
	}
	
	void poop() {
		numPoops ++;
		System.out.println("亲爱的妈妈，我拉臭臭了，请准备好尿布");
	}
	
	void sayHi() {
		System.out.println("你好，我叫：" + name);
	}
	
	void eat(double foodWeight) {
		weight += foodWeight;
	}
	
	public static void main(String[]args) {
		Baby dawa = new Baby("大力士", 20, true);
		Baby erwa = new Baby("千里眼", 19, true);
		Baby sanwa = new Baby("钢筋铁骨", 18, true);
		Baby siwa = new Baby("火神", 16, true);
		
		System.out.println(dawa.name);
		System.out.println(erwa.weight);
		System.out.println(sanwa.numPoops);
		
		dawa.sayHi();
		erwa.eat(1);
		sanwa.poop();

	}
}
