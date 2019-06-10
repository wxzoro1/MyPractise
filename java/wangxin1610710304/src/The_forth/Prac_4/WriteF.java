package The_forth.Prac_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class WriteF {
	public static void main(String[]args) throws FileNotFoundException{
		String name = "wx";
		int id = 007;
		int totalHours = 72;
		int days = 6;
		File f = new File("output.txt");
		try {
			PrintStream out = new PrintStream(f);
			out.print(name + "(ID#" + id + ")worked" + totalHours + " hours(" + (totalHours/days) + "hours/day)");
		} catch (FileNotFoundException e) {
			System.out.println("无法打开文件");	
		}
	}
}
