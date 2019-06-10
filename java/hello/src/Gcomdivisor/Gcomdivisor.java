package Gcomdivisor;

import java.util.Scanner;

public class Gcomdivisor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		int x = 1;
		for (int i = 2; i <=a && i<= b; i++ )
		{
			if(a%i == 0 && b%i ==0)
			{
//				System.out.println(i);
				x = i;
			}
		}
		System.out.print(x);
	}

}
