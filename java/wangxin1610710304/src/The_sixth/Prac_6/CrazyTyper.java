package The_sixth.Prac_6;

public class CrazyTyper {							//��һ��	(��������ִ��˳������)
	public static void main(String[] args) {
		ThTyper t1 = new ThTyper();
		t1.start();	//Thread-0
		RuTyper t = new RuTyper();
		Thread t2 = new Thread(t);
		t2.setPriority(8);
		t2.start(); //Thread-1						//(���ۣ���������� ���ȼ���ͬʱthread��)
	}
}

class ThTyper extends Thread{
	public void run() {
		for (int i = 1; i <= 1000 ; i++) {
			System.out.println(currentThread().getName()+":"+i);
		}
	}
}

class RuTyper implements Runnable{
	public void run() {
		for (int i = 1; i <= 1000 ; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}