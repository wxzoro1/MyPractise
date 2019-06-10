package The_eighth.Exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class HashMapwords {		//练习题 6
	public static void main(String[] args) throws IOException {
//		读取网页
        String address = "http://en.people.cn/";
        URL url = new URL(address);
        HttpURLConnection cnect= (HttpURLConnection)url.openConnection();
        InputStreamReader input = new InputStreamReader(cnect.getInputStream(), "utf-8");
        BufferedReader reader = new BufferedReader(input);
        String line = "";
        StringBuffer sBuffer = new StringBuffer();
        while((line = reader.readLine()) != null){
        	sBuffer.append(line);
        }
//      写入文件
        File f = new File("index.txt");
        try {
			PrintStream out = new PrintStream(f);
			out.println(sBuffer.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
//		统计单词
        HashSet<String> words = new HashSet<String>();
        Scanner in = new Scanner(new File("index.txt"));
        in.useDelimiter("[^a-zA-Z]+");
		while (in.hasNext()) {
			words.add(in.next());
		}
		System.out.println(frequency(words).toString());
		File f1 = new File("indexwords.txt");
        try {
			PrintStream out = new PrintStream(f1);
			out.println(frequency(words).toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
//		统计字母
        ArrayList<String> letters = new ArrayList<String>();
        Scanner in1 = new Scanner(new File("index.txt"));
        in1.useDelimiter("[^a-zA-Z]?");
		while (in1.hasNext()) {
			letters.add(in1.next().toLowerCase());
		}
		System.out.println(frequency(letters).toString());
		File f2 = new File("indexletters.txt");
        try {
			PrintStream out = new PrintStream(f2);
			out.println(frequency(letters).toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static HashMap<String, Integer>  frequency ( HashSet<String> names) throws FileNotFoundException{
        HashMap<String, Integer> frequency = new HashMap<String, Integer>();
        for (String name : names) {
			Integer currentCount = frequency.get(name);
			if (currentCount == null) {
				currentCount = 0;
			}
			frequency.put(name, ++currentCount);
		}
        return frequency;
	}
	
	public static HashMap<String, Integer>  frequency ( ArrayList<String> names) throws FileNotFoundException{
        HashMap<String, Integer> frequency = new HashMap<String, Integer>();
        for (String name : names) {
			Integer currentCount = frequency.get(name);
			if (currentCount == null) {
				currentCount = 0;
			}
			frequency.put(name, ++currentCount);
		}
        frequency.remove("");
        return frequency;
	}
}
