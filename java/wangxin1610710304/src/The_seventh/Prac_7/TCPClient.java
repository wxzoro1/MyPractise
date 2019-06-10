package The_seventh.Prac_7;

import java.io.*;
import java.net.*;

public class TCPClient {
	public static void main(String[]args) throws Exception{
		String strLocal,strSocket;
		Socket socketClient = new Socket("localhost", 5555);
		BufferedReader brInFromUser = 
				new BufferedReader(new InputStreamReader(System.in));
		BufferedReader brInFromServer = 
				new BufferedReader(new InputStreamReader(socketClient.getInputStream()));
		DataOutputStream dosOutToServer = 
				new DataOutputStream(socketClient.getOutputStream());
		do {
			strLocal = brInFromServer.readLine();
			dosOutToServer.writeBytes(strLocal + "\n");
			
			strSocket = brInFromServer.readLine();
			System.out.println("Server:" + strSocket);
		} while (!strSocket.equals("bye"));
		
		socketClient.close();
	}
}
