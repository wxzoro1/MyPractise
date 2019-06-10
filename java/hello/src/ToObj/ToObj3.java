package ToObj;
import java.util.Scanner;
public class ToObj3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = new String("a string");
		String a = "a string";
//		System.out.print(s+12+24);
		String b;
//		b = in.next();
//		System.out.print(b=="bye");												判断相同对象	
//		System.out.print(b.equals("bye"));										判断相同内容
//		String大小
//		String s1 = "abc";
//		String s2 = "bcd";
//		System.out.print(s1.compareTo(s2));
//		System.out.print("bcde".compareTo(s2));
		String s1 = "020coo2020l";
//		System.out.print(s1.charAt(3));											//输出字符串中特定位置字符
//		for (int i = 0; i<s1.length(); i++)										//for each不可用字符串遍历
//		{
//			System.out.print(s1.charAt(i));
//		}
//		System.out.println(s1.substring(4));
//		System.out.println(s1.substring(1,2));									//不算末尾
		int loc = s1.indexOf('0');
		System.out.println(loc);
		System.out.println(s1.indexOf('0',loc+1));//寻找第2个0
		loc = s1.indexOf('0',loc+1);
		System.out.println(s1.indexOf('0',loc+1));//寻找第3个 0
																		//s.toUpperCase() 需建立新对象才能使用 startwith直接用 	//字符串的Switch case this that  
	}

}
