package The_third.Prac_3;


public class DouDiZhu {
	public static void main(String[] args) {
		Person zhubajie = new Person();
		zhubajie.name = "��˽�";
		zhubajie.age = 800;
		zhubajie.height = "��һ����";
		zhubajie.weight= "��һ����";
		zhubajie.say("ʦ��,���Ǳ�ȥ�����ˣ������ֹ���");
	}

}

class Person{
	String name;
	int age;
	String height, weight;
	void say(String s) {
		System.out.println(s);
	}
}