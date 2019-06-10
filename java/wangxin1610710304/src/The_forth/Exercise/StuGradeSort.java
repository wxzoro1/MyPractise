package The_forth.Exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Scanner;

public class StuGradeSort {									//��ϰ�� 5
	public static void main(String[] args)  throws FileNotFoundException{
		ArrayList<String> item = new ArrayList<String>();
		HashMap<String, Double> newitem = new HashMap<String, Double>();
//		----------------------��ȡ���ݣ�������̬����-----------------------------
		Scanner input = new Scanner(new File("StuGrade.txt"));
		while (input.hasNext()) {
			if (input.hasNext()) {
				while (input.hasNext()) {
					item.add(input.next());
				}
			}
		}
//-------------------------��ȡ�����ͳ�����������------------------------------------
		String[] keystr = new String[(item.size()/3)];
		int num = 0;
		for (int i = 0; i <= item.size()-3; i += 3) {
			keystr[num++] = (item.get(i)+","+item.get(i+1));
		}
//-------------------------��ȡ�ɼ�����---------------------------------------------
		double[] valuestr = new double[(item.size()/3)];
		int num2 = 0;
		for (int i = 0; i <= item.size()-3; i += 3) {
			valuestr[num2++] = Double.valueOf(item.get(i+2));
		}
//-------------------------�ϳ�HashMap---------------------------------------------
		for (int i = 0; i <=(item.size()/3)-1  ; i++) {
			newitem.put(keystr[i], valuestr[i]);
		}
//--------------------------���ɼ�����---------------------------------------------
		List<Map.Entry<String, Double>> list = new ArrayList<Map.Entry<String, Double>>(newitem.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
			public int compare(Entry<String, Double> o1, Entry<String, Double> o2) {
				double result = o2.getValue()-o1.getValue();
				if (result > 0)
					return 1;
				else if (result == 0)
					return 0;
				else
					return -1;
			}	
		});
		System.out.println(list);
//-------------------------������д���ļ�------------------------------------------
		Object[] xStrings = (Object[])list.toArray(new Object[list.size()]);
		String[] re = new String[xStrings.length];
		for (int i = 0; i < re.length; i++) {
			re[i] = xStrings[i].toString();
		}
		String name = "������";
		String birth = "�������ڣ�";
		String score = "����:";
		String scorerank = "����:";
		int sturank = 1;
		File f = new File("StuRank.txt");
		PrintStream out = new PrintStream(f);
		for (int i = 0; i < re.length; i++) {
			out.append(name + re[i].substring(0, re[i].indexOf(",")) + "\t"  
					+ birth + re[i].substring(re[i].indexOf(",")+1, re[i].indexOf("=")) + "\t"
					+ score + re[i].substring(re[i].indexOf("=")+1,re[i].length()) + "\t"
					+ scorerank + sturank++ + "\r\n");
		}
	}
}
