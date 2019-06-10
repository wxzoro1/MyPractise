package Votestatics;

import java.util.Scanner;

public class Votestatics {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int []numbers = new int[10];					//´ÎÊý
		while(x != -1)
		{
			if ( x>=0 && x<=9)
			{
				System.out.println(numbers[x]);
				numbers[x] ++;
			}
			x = in.nextInt();
		}
		for(int i = 0; i<numbers.length; i++)
		{
			System.out.println(i+":"+numbers[i]);
		}
	}

}
