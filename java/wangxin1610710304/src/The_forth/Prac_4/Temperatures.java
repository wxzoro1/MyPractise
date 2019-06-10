package The_forth.Prac_4;

import java.io.*;
import java.util.*;

public class Temperatures {
	public static void main(String[] args)  throws FileNotFoundException{
		Scanner input = new Scanner(new File("weather2.txt"));
		int num = 0;
		double temp = 0;
		while (input.hasNext()) {
			if (input.hasNextDouble()) {
				temp += input.nextDouble();
				num++;
			}
			else input.next();
		}
		System.out.println("Average:" + temp/num);
	}
}
