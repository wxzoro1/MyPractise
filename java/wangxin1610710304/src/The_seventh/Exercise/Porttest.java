package The_seventh.Exercise;

import java.io.IOException;
import java.net.*;

public class Porttest {	//��ϰ�� 1
	public static void main(String[] args) throws UnknownHostException, InterruptedException {
		
		for (int port = 80; port <= 9999; port++) {
			Socket connect = new Socket();
	        try {
	            connect.connect(new InetSocketAddress("www.baidu.com", port),100);//��������
	            boolean res = connect.isConnected();
	            if (res) {
	            	System.out.println(port+"���ڷ���");
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
