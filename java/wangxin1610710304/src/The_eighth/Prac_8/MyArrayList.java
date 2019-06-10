package The_eighth.Prac_8;

import java.util.ArrayList;

public class MyArrayList {
	public static void main(String[]args) {
		ArrayList alist = new ArrayList();
		String str = new String("ÄÇÄê");
		Character c = new Character('ÎÒ');
		Integer n = new Integer(18);
		alist.add(str);
		alist.add(c);
		alist.add(n);
		String str2 = (String)alist.get(0);
		Character c2 = (Character)alist.get(1);
		Integer n2 = (Integer)alist.get(2);
		System.out.println(str2);
		System.out.println(c2);
		System.out.println(n2);
	}
}
