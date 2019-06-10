package The_third.Prac_3;


public class DouDiZhu {
	public static void main(String[] args) {
		Person zhubajie = new Person();
		zhubajie.name = "猪八戒";
		zhubajie.age = 800;
		zhubajie.height = "天一样高";
		zhubajie.weight= "地一样重";
		zhubajie.say("师傅,咱们别去西天了，该曲乐宫吧");
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