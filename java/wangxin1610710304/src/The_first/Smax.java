package The_first;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class Smax {
	private HashSet<Integer> nums = new HashSet<Integer>();		//�������
	
	public void add(int n){										//����
		nums.add(n);
	}
	
	public Integer[] list() {									//���������б�����
		Integer[] a = new Integer[nums.size()];
		List<Integer> tempList = new ArrayList<Integer>(nums);
		Collections.sort(tempList);
		tempList.toArray(a);
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println("������������ע��������20��������2���Ҳ�����0��:");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int count = 0;
		Smax sm = new Smax();
		while(count <=19)										//����20���Զ�����
		{
			if (x != 0 ) 
			{
				sm.add(x);
				x = in.nextInt();
			}
			else
			{
				break;
			}
			count++;
		}
		in.close();
		Integer[] a = sm.list();
		if(a.length>1) {
			System.out.println(a[a.length-2]);
		}
		else {
			System.out.println("��������2�����֣�����������");
		}
	}															//Notes:1.ͨ�����ַ���(��������̬����)��ֹ���鳬��20��ʱ���������
																//		2.ͨ��HashSet���������ظ�����ʹ������
}
