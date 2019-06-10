package prime;
import java.util.Scanner;
public class prime2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int num = in.nextInt();
		
		for(int num=2; num<1000; num++)
		{
			int isprime = 0;
			for (int i=2; i<num; i++) 
			{
				if(num % i == 0)
				{
					isprime = 1;
					break;
				}
			}
			if (isprime == 0)
			{
				System.out.print(num+" "); 					//println 是增加换行
			}
			else
			{
				System.out.print(" ");
			}
		}
	}
}

