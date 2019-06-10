package prime;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int isprime = 0;
		for (int i=2; i<num; i++) 
		{
			if(num % i == 0)
			{
				isprime = 1;
				System.out.println(num+"不是素数");
				break;
			}
		}
		if (isprime == 0)
		{
			System.out.println(num+"是素数");
		}
		else
		{
			System.out.println(num+"不是素数");
		}
	
}
}

