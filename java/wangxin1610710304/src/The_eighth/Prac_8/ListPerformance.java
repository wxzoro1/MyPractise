package The_eighth.Prac_8;

import java.util.ArrayList;
import java.util.Random;

public class ListPerformance {
	public static void main(String[] args) {
		int length = 10000;
		int[] indicesA = getIndices(length);
		int[] indicesB = getIndices(length);
		ArrayList<Double> list = new ArrayList<>();
		Double element;
		long time0, time1;
		//����б��Ԫ��
		for (int i = 0; i < length; i++) {
			list.add(new Double(i));
		}
		time0 = System.nanoTime();
		for (int i = 0; i < length; i++) {
			element = list.get(indicesA[i]);
			list.set(indicesB[i],element);
		}
		time1 = System.nanoTime();
		System.out.println(list.getClass());
		System.out.println("For length = " + length);
		System.out.println("Average get and set time = "+
							(time1-time0)/length + "ns");
		System.out.println("Total time = "+ (time1-time0) + "ns");
	}
	//����һ�����飬ÿ��Ԫ��Ϊ0~length-1֮�����������Ҳ��ظ�
	private static int[] getIndices(int length) {
		Random random = new Random();
		ArrayList<Integer> integers = new ArrayList<>();
		int[] indices = new int[length];
		for (int i = 0; i < length; i++) {
			integers.add(random.nextInt(i+1), new Integer(i));
		}
		for (int i = 0; i < length; i++) {
			indices[i] = integers.get(i);
		}
		return indices;
	}
}
