package The_seventh.Exercise;

import java.io.IOException;
import java.net.*;

public class Porttest {	//练习题 1
	public static void main(String[] args) throws UnknownHostException, InterruptedException {
		
		for (int port = 80; port <= 9999; port++) {
			Socket connect = new Socket();
	        try {
	            connect.connect(new InetSocketAddress("www.baidu.com", port),100);//建立连接
	            boolean res = connect.isConnected();
	            if (res) {
	            	System.out.println(port+"正在服务");
	            }  
	        }catch (IOException e) {
	        	System.out.print("");
	        }finally{
	            try {
	                connect.close();
	            }catch (IOException e) {
	                System.out.println("false");
	            }
	        }
		}
		System.out.println("done");
		
	}	
}
