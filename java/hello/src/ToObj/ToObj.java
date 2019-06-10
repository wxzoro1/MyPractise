package ToObj;
import java.util.Scanner;
public class ToObj {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char c = 'c';
		c++;
		char d ='a';
		char e = 'd';
		char u = '\u0041';
		char x = 65;
		char f = (char)(c+'A'-'a'-1);
		System.out.print(e-d);
		System.out.print((int)c);
		System.out.println(u+1231);
		System.out.println(x);
		System.out.println(f);
	}

}
