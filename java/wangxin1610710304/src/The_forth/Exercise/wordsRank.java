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
import java.util.Scanner;
import java.util.Map.Entry;


public class wordsRank {							//练习题 7
	public static void main(String[] args) throws FileNotFoundException{
//		--------提取数据到动态数组------------------------------------------------
		ArrayList<String> item = new ArrayList<String>();
		Scanner input = new Scanner(new File("wordslist.txt"));
		while (input.hasNext()) {
			if (input.hasNext()) {
				while (input.hasNext()) {
					item.add(input.next());
				}
			}
		}
		System.out.println(item.toString());
//		--------转换为HashMap计数-------------------------------------------------------------------------------
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String k:item) {
			if (map.containsKey(k)) {
				map.put(k, map.get(k).intValue()+1);
			}else {
				map.put(k, new Integer(1));
			}
		}
		System.out.println(map.toString());
//		--------按次数排序--------------------------------------------------------
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
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
//		------- 写入文件----------------------------------------------------------
		Object[] xStrings = (Object[])list.toArray(new Object[list.size()]);
		String[] re = new String[xStrings.length];
		for (int i = 0; i < re.length; i++) {
			re[i] = xStrings[i].toString();
		}
		String word = "单词：";
		String count = "次数：";
		File f = new File("newwordslist.txt");
		PrintStream out = new PrintStream(f);
		for (int i = 0; i < re.length; i++) {
			out.append(word + re[i].substring(0, re[i].indexOf("=")) + "\t"  
					  +count + re[i].substring(re[i].indexOf("=")+1, re[i].length())
					+ "\r\n");
		}
		
	}
}
