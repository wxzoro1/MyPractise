package The_sixth.Prac_6;

public class ChaoticSum extends Thread{ 			//�ڶ���  �����н��Ϊ21 ����ʱ��Ƭ��ת��t��ʼȡd.sum=1������t++=2��
	public static void main(String[] args) {	    //        ��������������޸ĺ�d.sum=20תΪ2���ٽ���ѭ����21��
		Data d = new Data(0);
		MyThread t = new MyThread(d);
		Thread t1 = new Thread(t);
		t1.start();
		for (int i = 0; i < 20; i++) {
			d.sum++;
			try {Thread.sleep(1);} catch(Exception e) {}
		}
		
		System.out.println(d.sum);
	}
}

class Data{
	public int sum;
	public Data (int n) {
		sum = n;
	}
}

class MyThread implements Runnable{
	Data data;
	public MyThread(Data d) {
		data = d;
	}
	public void run() {
		int t;
		for (int i = 0; i < 20; i++) {
			t = data.sum;
			t++;
			try {Thread.sleep(1);} catch (Exception e) {}
			data.sum = t;
		}	
	}
}
