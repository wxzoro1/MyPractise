package The_seventh.Prac_7;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPServerThread extends Thread{
	Socket socket;
	int nClientNum;
	public TCPServerThread(Socket s,int num) {
		socket = s;
		nClientNum = num;
	}
	public void run() {
		try {
			String strSocket,strLocal;
			BufferedReader brInFromClient = 
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
			DataOutputStream dosOutToClient = 
					new DataOutputStream(socket.getOutputStream());
			do {
				strSocket = brInFromClient.readLine();
				System.out.println("Client"+nClientNum+":"+strSocket);
				strLocal = strSocket;
				dosOutToClient.writeBytes(strLocal + '\n');
			} while (!strSocket.equals("bye"));
			
			socket.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
