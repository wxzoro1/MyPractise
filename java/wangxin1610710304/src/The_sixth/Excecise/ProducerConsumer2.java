package The_sixth.Excecise;

public class ProducerConsumer2 {
	public static void main(String[] args) {
		Buffer2 b = new Buffer2();
		Producer2 p = new Producer2(b);
		p.start();
		Consumer2 c = new Consumer2(b);
		c.start();
	}
}
class Buffer2{
	public int data;
	public boolean isEmpty = true;
	public synchronized void produce(int n) {
		if (isEmpty == false) {
			try {
				wait();
			} catch (Exception e) {}
		}
		data = n;
		isEmpty = false;
		notify();
	}
	public synchronized void consume() {
		if (isEmpty == true) {
			try {
				wait();
			} catch (Exception e) {}
		}
		System.out.println(data);
		isEmpty = true;
		notify();
	}
}


class Producer2 extends Thread{
	Buffer2 buffer;
	public Producer2 (Buffer2 b) {
		buffer = b;
	}
	public void run() {
		int i;
		for ( i = 1; i <= 5; i++) {
			buffer.produce(i);
		}
	}
}

class Consumer2 extends Thread{
	Buffer2 buffer;
	public Consumer2(Buffer2 b) {
		buffer = b;
	}
	public void run() {
		int i;
		for(i = 1; i <= 5 ;i++) {
			buffer.consume();
		}
	}
}