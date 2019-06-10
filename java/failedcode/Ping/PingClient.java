package The_seventh.Exercise.Ping;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PingClient extends Thread{
	private DatagramSocket client;
	private InetAddress hostAddress;
	int port;
	
	int j = 0;
	long minRtt = 0, maxRtt = 0, avrRtt = 0, sumRtt = 0;
	long[] rtt = new long[10];
	
	public PingClient(String host, int port) {
		this.port = port;
		try {
			client = new DatagramSocket();
			hostAddress = InetAddress.getByName(host);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}catch (SocketException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ddhh:mm:ss.SS");
		for (int i = 0; i < 10; i++) {
			rtt[i] = 0;
		}
		for (int i = 0; i < 10; i++) {
			Date sendTime = new Date();
			String outMessage = new String("PingUDP:" +i+","+sdf.format(sendTime));
			String receive = null;
			byte[] buffer = outMessage.getBytes();
			byte[] buf = new byte[buffer.length];
			DatagramPacket sendPacket = new DatagramPacket(buffer, buffer.length, hostAddress, port);
			DatagramPacket receivePacket = new DatagramPacket(buf, buf.length);
			try {
				client.send(sendPacket);
				client.setSoTimeout(1000);
				client.receive(receivePacket);
				receive = new String(receivePacket.getData());
				while (!receive.equals(outMessage)) {
					receive = null;
					client.receive(receivePacket);
					receive = new String(receivePacket.getData());
				}
				Date receiveTime = new Date();
				rtt[i] = receiveTime.getTime()-sendTime.getTime();
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("��Ӧ���Ķ�ʧ��ʱ��"+"\n");
				e.printStackTrace();
			}
			
			if (receive != null) {
				System.out.println(receive);
				System.out.println("rtt:"+rtt[i]);
			}
		}
		if (rtt[0] != 0) {
			minRtt = rtt[0];
			maxRtt = rtt[0];
			sumRtt = rtt[0];
			j++;
		}
		else minRtt = 2000;
		
		for (int i = 0; i < 10; i++) {
			if (rtt[i] != 0) {
				j++;
				if (minRtt>rtt[i]) {
					minRtt = rtt[i];
				}
				if (maxRtt<rtt[i]) {
					maxRtt = rtt[i];
				}
				sumRtt = sumRtt + rtt[i];
			}
		}
		
		if (j != 0) {
			avrRtt = sumRtt/j;
			System.out.println("������10�����󣬳ɹ�����" + j + "�ظ�����");
			System.out.println("��С����ʱ�䣺"+ minRtt);
			System.out.println("�������ʱ�䣺"+ maxRtt);
			System.out.println("ƽ������ʱ�䣺"+ avrRtt);
		}
		else {
			System.out.println("��������ʧ�ܣ��޻��ͱ���");
		}
		client.close();
	}
	public static void main(String[] args) {
		PingClient clientThread = new PingClient(args[0], Integer.valueOf(args[1]));
		clientThread.start();
	}
}
