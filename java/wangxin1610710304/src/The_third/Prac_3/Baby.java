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
		System.out.println("�װ������裬���������ˣ���׼������");
	}
	
	void sayHi() {
		System.out.println("��ã��ҽУ�" + name);
	}
	
	void eat(double foodWeight) {
		weight += foodWeight;
	}
	
	public static void main(String[]args) {
		Baby dawa = new Baby("����ʿ", 20, true);
		Baby erwa = new Baby("ǧ����", 19, true);
		Baby sanwa = new Baby("�ֽ�����", 18, true);
		Baby siwa = new Baby("����", 16, true);
		
		System.out.println(dawa.name);
		System.out.println(erwa.weight);
		System.out.println(sanwa.numPoops);
		
		dawa.sayHi();
		erwa.eat(1);
		sanwa.poop();

	}
}
