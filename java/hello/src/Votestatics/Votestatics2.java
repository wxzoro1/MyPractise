package Votestatics;

import java.util.Scanner;

public class Votestatics2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int[] data = {3,2,2,3,3,1,3,4,5,6,6,7,89,1};
		int loc = -1;
		for (int i = 0; i< data.length; i++)
		{
			if(x==data[i])
			{
			loc = i;
			break;
			}
		}
		if(loc>-1)
		{
			System.out.print(x+"第"+(loc+1)+"个");
		}
		else
		{
			System.out.print(x+"不在");
		}
	}

}
