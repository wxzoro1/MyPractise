package The_third.Prac_3;

class Parent1{
}

class Child1 extends Parent1{
	public String name;
	public void setName(String s) {
		name = s;
	}
}
public class Parent_Test {
	public static void main(String[] args) {
		Parent1 b = new Child1();		//如果是new Parent1(); 编译无错但是会产生ClassCastException错误
		Child1 a = (Child1)b;			//对3.4.1例子采用 向下造型
		a.setName("悟空");
		System.out.println(a.name);
		
		Parent1 b1 = new Child1();
		Parent1 b2 = new Parent1();
		if (b1 instanceof Child1){		//向下造型不明确时，用instanceof
			Child1 a1 = (Child1)b1;
			a1.setName("悟空");
			System.out.println(a1.name);
		}
		if (b2 instanceof Child1){		//向下造型不明确时，用instanceof
			Child1 a2 = (Child1)b2;
			a2.setName("八戒");
			System.out.println(a2.name);
		}
		


		
	}
}
