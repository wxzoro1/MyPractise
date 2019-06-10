package The_seventh.Prac_7;

import java.net.*;

public class WhoAmI {
	public static void main(String[] args) throws Exception{
		if (args.length != 1) {
			System.err.println("Usage: WhoAmI MachineName");
			System.exit(1);
		}
		InetAddress a = InetAddress.getByName(args[0]);
//		InetAddress a = InetAddress.getByName("www.baidu.com");
		System.out.println();
		System.out.println(a.getHostName());
		System.out.println(a.getHostAddress());
	}
}
