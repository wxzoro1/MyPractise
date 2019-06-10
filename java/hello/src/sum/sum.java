package sum;
import java.util.Scanner;
public class sum {				// 功能：1.输入x  2.计算sum = 1 - 1/2 + 1/3 - 1/4 +...1/n;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int sum = 0;			//类型定义错误, 正确情况应将此行改为：double sum = 0;
		int sign = 1;
		for(int i=1; i<=num; i++, sign = -sign)
		{
			sum += sign*(1.0/i);
		}
		System.out.print(sum);
	}
	
}
