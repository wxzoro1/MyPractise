package The_eighth.Exercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ListInsertPerformance2 {		//��ϰ�� 3
	public static void main(String[] args) {
		int length = 10000;
		long time0, time1, time2;
		Random random = new Random();
		LinkedList<Integer> list = new LinkedList<Integer>();
//		���Ԫ��
		for (int i = 0; i < length; i++) {
			list.add(i);
		}
		time0 = System.nanoTime();
//		ɾ��Ԫ��
		for (int i = 0; i < length/2 ; i++) {
			list.remove(random.nextInt(i+1));	//��Ϊlist.remove(1); ��linkedlist��; ��Ϊlinkedlistɾ��֮ǰ����Ҫ�������ҵ�ʱ���arraylist��
		}
		time1 = System.nanoTime();
//		����Ԫ��
		for (int i = 0; i < length/4; i++) {
			list.add(random.nextInt(5000),0);	//��Ϊlist.add(4,0); ��linkedlist��;	��Ϊlinkedlist����֮ǰ����Ҫ�������ҵ�ʱ���arraylist��
		}
		time2 = System.nanoTime();
		System.out.println(time0);
		System.out.println(time1);
		System.out.println("LinkedList Average delete time = "+(time1-time0)/(length/2)+"ns");
		System.out.println("LinkedList Average insert time = "+(time2-time1)/(length/4)+"ns");
	}
}