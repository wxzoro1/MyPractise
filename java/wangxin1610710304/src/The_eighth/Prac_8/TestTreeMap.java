package The_eighth.Prac_8;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		Map<String , Integer> directory = new TreeMap<String, Integer>();
		directory.put("Mum", new Integer(9998888));
		directory.put("Dad",9998888);
		directory.put("Bob", 12345678);
		directory.put("Edward", 5553535);
		directory.put("Bob", 1000000);
		System.out.println(directory.size());
		for (String key : directory.keySet()) {
			System.out.println(key + "'s # :");
			System.out.println(directory.get(key));
		}
		System.out.println(directory.values());
	}
}
