package prime;
import java.util.Scanner;
public class prime3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int count = 0;							//¼ÆÊý
		int n = 2;
		while (count<10)
		{
			int isprime = 0;
			int i = 2;
			while(i<n)
			{
				if(n % i ==0)
				{
					isprime = 1;
					break;
				}
				i = i+1;
			}
			if(isprime == 0)
			{
				System.out.print(n+" ");
				count = count + 1;
				System.out.println("count="+count);
			}
			else
				System.out.print("");
		n = n + 1;
		}
	}
}

