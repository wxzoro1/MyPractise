package factorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
//		int result = 1;
//		while( number > 0)							//i在while外
//		{
//			result = result * number ;
//			number = number-1;
//		}
//		System.out.println("结果为："+result);
		int result = 1;
		for(int i=1; i<=number; i++)				//i只在循环里 
		{
			result *= i;
		}
		System.out.println("结果为："+result);
	}

}
