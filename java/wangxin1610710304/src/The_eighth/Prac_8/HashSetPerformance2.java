package The_eighth.Prac_8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class HashSetPerformance2 {
	public static void main(String[]args) {
		int length = 10000;
		ArrayList<Integer> set = new ArrayList<Integer>();
		long t1, t2;
		for (int i = 0; i < length; i++) {
			set.add(new Integer(i));
		}
		Random random = new Random();
		t1 = System.nanoTime();
		for (int i = 0; i < length; i++) {
			int e = random.nextInt(length);
			set.contains(new Integer(e));
		}
		t2 = System.nanoTime();
		System.out.println(set.getClass());
		System.out.println("For length = " + length);
		System.out.println("Average query time = " + 
							(t2 - t1)/length + "ns");
	}
}
