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
				System.out.println("��");
			}
			else if(a < number)
			{
				System.out.println("С");
			}
			else 									//�˴�û��Ҫд ���Էŵ����һ����� �������
			{
				System.out.println("RIGHT");
			}
		}while (a != number);
		System.out.println("����"+count+"��");
	}
}
		
