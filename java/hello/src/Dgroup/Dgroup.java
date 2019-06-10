package Dgroup;

import java.util.Scanner;

public class Dgroup {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] numbers = new int[100]; 							//如果用户输入100个以上的数据 会存在溢出
		int x = in.nextInt();
		int count = 0;
		double sum = 0.0;
		while(x != -1)
		{
			numbers[count] = x;
			count += 1;
			sum = sum + x;
			x = in.nextInt();
		}
		double average = sum/count;
		for (int i = 0; i< count; i++)
			if(numbers[i]>average)
			{
				System.out.println(numbers[i]);
			}
	}

}
