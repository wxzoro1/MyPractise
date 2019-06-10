package The_sixth.Prac_6;

public class ChaoticSum extends Thread{ 			//第二题  （运行结果为21 由于时间片轮转，t开始取d.sum=1，而后t++=2，
	public static void main(String[] args) {	    //        阻塞后把主进程修改后d.sum=20转为2，再进行循环到21）
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
