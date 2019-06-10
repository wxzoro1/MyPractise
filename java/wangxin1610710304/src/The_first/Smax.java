package The_first;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class Smax {
	private HashSet<Integer> nums = new HashSet<Integer>();		//避免溢出
	
	public void add(int n){										//增添
		nums.add(n);
	}
	
	public Integer[] list() {									//生成数组列表并排序
		Integer[] a = new Integer[nums.size()];
		List<Integer> tempList = new ArrayList<Integer>(nums);
		Collections.sort(tempList);
		tempList.toArray(a);
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println("请输入整数（注：不超过20个不少于2个且不包含0）:");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int count = 0;
		Smax sm = new Smax();
		while(count <=19)										//超过20个自动结束
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
			System.out.println("输入少于2个数字，请重新运行");
		}
	}															//Notes:1.通过两种方法(计数，动态数组)防止数组超过20个时发生的情况
																//		2.通过HashSet避免输入重复数字使排序复杂
}
