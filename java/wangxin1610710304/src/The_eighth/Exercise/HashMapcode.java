package The_eighth.Exercise;

import java.awt.Window.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;

import The_forth.Prac_4.Temperatures;


public class HashMapcode {	//练习题 5
	public static void main(String[] args) {
		HashMap<String, String> keyword = new HashMap<String, String>();
		ArrayList<String> keyList = new ArrayList<String>();
		ArrayList<String> valuelist = new ArrayList<String>();
//		自动生成keyList
		for (Character i = 97; i <= 122; i++) {
			keyList.add(i.toString());
		}
		keyList.add("*");
//		生成valuelist
		String[] vlist = {"v","e","k","n","o","h","z","f","*","i","l","j","x","d","m",
		                  "y","g","b","r","c","s","w","q","u","p","t","a"};
		for (int i = 0; i < vlist.length; i++) {
			valuelist.add(vlist[i]);
		}
//		合并成hashmap
		for (int i = 0; i < vlist.length; i++) {
			keyword.put(keyList.get(i), valuelist.get(i));
		}
		System.out.println(keyword.toString());
//		测试
		String f = "Apple*Banana";
		f = f.toLowerCase();
		System.out.println(f.substring(0, 1));
		String temp;
		for (int i = 0; i < f.length(); i++) {
			temp = keyword.get(f.substring(i, i+1));
			System.out.print(temp);
		}
	}
}
