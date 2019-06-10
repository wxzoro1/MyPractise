package sum;
import java.util.Scanner;
public class sum2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int rem;
		int oa = a; 
		int ob = b;
		while(b!=0)
		{
			rem = a%b ;
			a = b;
			b = rem;
		}
		System.out.println(a);
	}
}

