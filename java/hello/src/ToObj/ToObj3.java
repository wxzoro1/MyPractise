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
//		System.out.print(b=="bye");												�ж���ͬ����	
//		System.out.print(b.equals("bye"));										�ж���ͬ����
//		String��С
//		String s1 = "abc";
//		String s2 = "bcd";
//		System.out.print(s1.compareTo(s2));
//		System.out.print("bcde".compareTo(s2));
		String s1 = "020coo2020l";
//		System.out.print(s1.charAt(3));											//����ַ������ض�λ���ַ�
//		for (int i = 0; i<s1.length(); i++)										//for each�������ַ�������
//		{
//			System.out.print(s1.charAt(i));
//		}
//		System.out.println(s1.substring(4));
//		System.out.println(s1.substring(1,2));									//����ĩβ
		int loc = s1.indexOf('0');
		System.out.println(loc);
		System.out.println(s1.indexOf('0',loc+1));//Ѱ�ҵ�2��0
		loc = s1.indexOf('0',loc+1);
		System.out.println(s1.indexOf('0',loc+1));//Ѱ�ҵ�3�� 0
																		//s.toUpperCase() �轨���¶������ʹ�� startwithֱ���� 	//�ַ�����Switch case this that  
	}

}
