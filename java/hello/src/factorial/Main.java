package factorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
//		int result = 1;
//		while( number > 0)							//i��while��
//		{
//			result = result * number ;
//			number = number-1;
//		}
//		System.out.println("���Ϊ��"+result);
		int result = 1;
		for(int i=1; i<=number; i++)				//iֻ��ѭ���� 
		{
			result *= i;
		}
		System.out.println("���Ϊ��"+result);
	}

}
