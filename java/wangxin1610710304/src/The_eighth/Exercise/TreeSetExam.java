package The_eighth.Exercise;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExam {	//��ϰ�� 4
	public static void main(String[] args) {
		Set<Integer> num = new TreeSet<Integer>();
		Random random = new Random();
		for (int i = 0; i < 80; i++) {
			num.add(random.nextInt(100));
		}
		int count = 0;
		for (Integer i : num) {
			System.out.println(i);
			count++;
		}
		System.out.println("��������"+count+"����ͬ����");
	}
}
