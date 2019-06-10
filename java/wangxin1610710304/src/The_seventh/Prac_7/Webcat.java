package The_seventh.Prac_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Webcat {
	public static void main(String[]args) {
		try {
			URL u = new URL(args[0]);
//			URL u = new URL("https://www.runoob.com/java/java-url-processing.html");
			InputStream in = u.openStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String theLine;
			while ((theLine = br.readLine()) != null) {
				System.out.println(theLine);
			}
		} catch (IOException e) {
		System.err.println(e);
		}
	}
}
