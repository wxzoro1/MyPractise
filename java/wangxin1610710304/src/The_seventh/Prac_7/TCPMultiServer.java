package The_seventh.Prac_7;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPMultiServer {
	static int nClientNum = 0;
	public static void main(String[] args) throws Exception {
		ServerSocket ssocketWelcome = new ServerSocket(6789);
		while (true) {
			Socket socketServer = ssocketWelcome.accept();
			nClientNum ++;
			TCPServerThread thread;
			thread = new TCPServerThread(socketServer,nClientNum);
			thread.start();
		}
	}
}
