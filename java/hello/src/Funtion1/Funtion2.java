package Funtion1;
import java.util.Scanner;

public class Funtion2 {
	public static int sum (int a,int b) 
	{
		int i;
		int sum=0;
		for (i=a; i<=b; i++) 
		{
			sum = sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int m = in.nextInt();
	int n = in.nextInt();
	
	System.out.print(sum(m,n));					//����ʱ char->int->double ���ú�����Զֻ�ܴ�ֵ������
	
	}


}
