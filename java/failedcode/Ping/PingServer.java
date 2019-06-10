package The_seventh.Exercise.Ping;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import org.jsoup.helper.Validate;

public class PingServer extends Thread{
	private int initPort;
	private byte[] buf = new byte[32];
	private DatagramPacket packet;
	private DatagramSocket socket;
	
	public PingServer(int initPort) {
		this.initPort = initPort;
	}
	
	public void run() {
		try {
			socket = new DatagramSocket(initPort);
			System.out.println("Server started");
		} catch (SocketException e) {
			e.printStackTrace();
			System.exit(0);
		}
		long startTime = System.currentTimeMillis();
		while (true) {
			try {
				packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
			} catch (IOException e) {
			e.printStackTrace();
			}
			System.out.println("接收到这个分组的时间与服务器启动的时间差：" +
			(System.currentTimeMillis()-startTime)+"毫秒！");
			if (5000>(System.currentTimeMillis()-startTime) || 
					(System.currentTimeMillis()-startTime)>5500) {
				ThreadServer server = new ThreadServer(socket, packet);
				server.start();
			}
			else {
				System.out.println("报文丢失！");
			}
		}
	}
	public void destroy() {
		socket.close();
	}
	
	public static void main(String[] args) {
		PingServer ping = new PingServer(Integer.valueOf(args[0]));
		ping.start();
	}
	
}
