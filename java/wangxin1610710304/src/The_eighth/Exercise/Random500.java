package The_eighth.Exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Random500 {		//��ϰ�� 1 
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
			num.add(random.nextInt(1000));
		}
		Iterator<Integer> iter = num.iterator();
		while (iter.hasNext()) {
			Integer integer = (Integer) iter.next();
			if (integer.intValue() < 500) {
				iter.remove();
			}	//Note: Ӧ�� iterator,��for��each�޸Ļᱨ��
		}
		for (Integer x : num) {
			System.out.println(x);
		}
	}
}
