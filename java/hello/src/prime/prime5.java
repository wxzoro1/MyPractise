package prime;
import java.util.Scanner;
public class prime5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		boolean[] primes = new boolean[100];
		for(int i=0; i<primes.length; i++)				//³õÊ¼»¯
		{
			primes[i] = true;
		}
		
		for (int i=2;i<primes.length;i++)
		{
			if(primes[i])
			{
				for(int k = 2; i*k<primes.length;k++)
				{
					primes[i*k] = false;
				}
			}
		}
		for(int i=2; i<primes.length;i++)
		{
			if(primes[i]==true)
			{
				System.out.print(i+" ");
			}
		}

	}
}

