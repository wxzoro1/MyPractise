package The_seventh.Exercise;

import java.net.InetAddress;
import java.util.Scanner;

public class WhoIM {		//¡∑œ∞Ã‚ 2
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		InetAddress a = InetAddress.getByName(in.next());
		System.out.println();
		System.out.println(a.getHostName());
		System.out.println(a.getHostAddress());
	}
}
