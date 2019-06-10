package The_eighth.Prac_8;

import java.util.HashMap;

public class HashmapExample {
	public static void main(String[] args) {
		String[] strs = new String[] {
				"Momo","Momo","Koko","Noa","Momo","Koko"
		};
		System.out.println(frequency(strs).toString());
	}
	public static HashMap<String, Integer> frequency (String[] names){
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
}
