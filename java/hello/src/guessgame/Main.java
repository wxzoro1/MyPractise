package guessgame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int number = (int)(Math.random()*100+1);		//1-100
		int count = 0;
		int a;
		do{
			a = in.nextInt();
			count = count + 1;
			if (a > number)
			{
				System.out.println("大");
			}
			else if(a < number)
			{
				System.out.println("小");
			}
			else 									//此处没必要写 可以放到最后一起输出 单口输出
			{
				System.out.println("RIGHT");
			}
		}while (a != number);
		System.out.println("共猜"+count+"次");
	}
}
		
