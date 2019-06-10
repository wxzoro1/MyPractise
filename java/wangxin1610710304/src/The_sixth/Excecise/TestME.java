package The_sixth.Excecise;

public class TestME extends Thread{
	public static void main(String[] args) {
		Data d = new Data(1);
		Thread1 t1 = new Thread1(d);
		t1.start();
		Thread2 t2 = new Thread2(d);
		t2.start();
		try {
			sleep(1);
		} catch (Exception e) {}
		System.out.println(d.count);
	}
}
class Data{
	public int count ;
	public Data(int n) {
		count = n;
	}
}
class Thread1 extends Thread{
	Data data;
	public Thread1(Data d) {
		data = d;
	}
	public void run() {
		int tmp1;
//		try {
//			Thread1.sleep(10);
//		} catch (Exception e) {
//		}
		synchronized (data) {
			tmp1 = data.count;
			tmp1 ++;
			data.count = tmp1;
		}
	}
}
class Thread2 extends Thread{
	Data data;
	public Thread2(Data d) {
		data = d;
	}
	public void run() {
		int tmp2;
		synchronized (data) {
			tmp2 = data.count;
			tmp2 = tmp2 + 2;
			data.count = tmp2;	
		}
	}
}
