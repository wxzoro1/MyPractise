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
		Parent1 b = new Child1();		//�����new Parent1(); �����޴��ǻ����ClassCastException����
		Child1 a = (Child1)b;			//��3.4.1���Ӳ��� ��������
		a.setName("���");
		System.out.println(a.name);
		
		Parent1 b1 = new Child1();
		Parent1 b2 = new Parent1();
		if (b1 instanceof Child1){		//�������Ͳ���ȷʱ����instanceof
			Child1 a1 = (Child1)b1;
			a1.setName("���");
			System.out.println(a1.name);
		}
		if (b2 instanceof Child1){		//�������Ͳ���ȷʱ����instanceof
			Child1 a2 = (Child1)b2;
			a2.setName("�˽�");
			System.out.println(a2.name);
		}
		


		
	}
}
