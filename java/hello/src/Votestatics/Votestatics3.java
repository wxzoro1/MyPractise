package Votestatics;

import java.util.Scanner;

public class Votestatics3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int[] data = {3,2,2,3,3,1,3,4,5,6,6,7,89,1};
		int loc = -1;
		boolean found = false;
		for (int k:data)					//for each 循环  		不能更改数组元素，便于遍历
		{
			if(x==k)
			{
			found = true;
			break;
			}
		}
		if (found == true)
		{
			System.out.print("在");
		}
		else
		{	System.out.print("不在");
		}
		}
		}
		


