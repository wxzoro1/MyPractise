package The_eighth.Exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListCheck { 		//¡∑œ∞Ã‚ 2
	public static void main(String[] args) throws FileNotFoundException {
		LinkedList<String> LinkedListText = readWords("LinkedListText.txt");
		for (String s : LinkedListText) {
			System.out.println(s);
		}
	}
	public static LinkedList<String> readWords (String filename) throws FileNotFoundException {
		LinkedList<String> words = new LinkedList<String>();
		Scanner in = new Scanner(new File(filename));
		while (in.hasNextLine()) {
			String temp = in.nextLine();
			if (words.contains(temp)) {
				continue;
			}
			else words.add(temp);
		}
		return words;
	}
}
