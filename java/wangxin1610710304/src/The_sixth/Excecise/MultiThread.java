package The_sixth.Excecise;

public class MultiThread {
	public static void main(String[] args) {
		System.out.println("main thread starts");
//		--------------����һ-------------------
//		SpeakThread thread = new SpeakThread();
//		thread.start();
//		try {
//			thread.sleep(10);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		--------------������-------------------	
		SpeakThread thread = new SpeakThread();
		Thread t = new Thread(thread);
		t.start();
		try {
		t.sleep(10);
	} catch (Exception e) {
		// TODO: handle exception
	}
//		---------------------------------------
		System.out.println("I'm eating");
		System.out.println("main thread ends");
	}
}
//--------------   ---����һ----------------------
//class SpeakThread extends Thread{
//	public void run() {
//		System.out.println("new thread starts");
//		System.out.println("I'm speaking");
//		System.out.println("new thread ends");
//	}
//}
//---------------------������---------------------
class SpeakThread implements Runnable{
	public void run() {
		System.out.println("new thread starts");
		System.out.println("I'm speaking");
		System.out.println("new thre ad ends");
	}
}