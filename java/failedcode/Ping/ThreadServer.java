package The_seventh.Exercise.Ping;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ThreadServer extends Thread{
	private DatagramSocket socket;
	private DatagramPacket packet;
	
	public  ThreadServer(DatagramSocket socket, DatagramPacket packet) {
		this.socket = socket;
		this.packet = packet;
	}
	
	public void run() {
		long randomTime = (long)(Math.random()*1500);
		String data = new String(packet.getData());
		byte[] buffer = data.getBytes();
		System.out.println("收到报文"+data);
		
		InetAddress host = packet.getAddress();
		int port = packet.getPort();
		
		DatagramPacket send = new DatagramPacket(buffer, buffer.length, host, port);
		try {
			socket.send(send);
		} catch (IOException e) {
			System.out.println("服务器发送回复报文失败！");
			e.printStackTrace();
		}
	
	}
}
