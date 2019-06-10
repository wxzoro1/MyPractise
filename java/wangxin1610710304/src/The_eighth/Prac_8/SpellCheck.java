package The_eighth.Prac_8;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SpellCheck {
	public static void main(String[] args) throws Exception{
		Set<String> dictionaryWords = readWords("words.txt");
		Set<String> documentWords = readWords("1.txt");
		for (String word : documentWords) {
			if (!dictionaryWords.contains(word)) {
				System.out.println(word);
			}
		}
	}
	public static Set<String> readWords (String filename) throws Exception{
		Set<String> words = new HashSet<String>();
		Scanner in = new Scanner(new File(filename));
		//使用a~z或A~Z之外的字符作为分隔符
		in.useDelimiter("[^a-zA-Z]+");
		while (in.hasNext()) {
			words.add(in.next().toLowerCase());
		}
		return words;
	}
}
