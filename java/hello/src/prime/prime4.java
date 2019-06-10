package prime;
import java.util.Scanner;
public class prime4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int[] primes = new int[50];
		primes[0] = 2;
		int cnt = 1;
		MAIN_LOOP:
		for(int a=3; cnt<50 ; a++)
		{
			for(int i=0; i<cnt; i++)
			{
				if(a%primes[i]==0)
				{
					continue MAIN_LOOP;
				}
			}
			primes[cnt++]=a;
		}
		for(int k:primes)
		{
			System.out.print(k+" ");
		}
	}
}

