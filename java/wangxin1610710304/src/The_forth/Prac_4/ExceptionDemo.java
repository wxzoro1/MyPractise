package The_forth.Prac_4;

class MyException extends Exception{
	public MyException(String message) {
		super(message);
	}
}
public class ExceptionDemo {
	public void f(int num) throws MyException{
		if(num < 0) {
			throw new MyException("��������Ϊ����");
		}
		System.out.println(num);
	}
	public void g() {
		try {
			f(1);
			f(3);
			f(0);
			f(-1);
			f(2);
			f(-5);
		} catch (MyException e) {
			System.out.println(e.getMessage());
			return;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		}finally {
			System.out.println("����ʲôʱ��");
		}
	}
	public static void main(String[]args) {
		ExceptionDemo demo = new ExceptionDemo();
		demo.g();
	}
}
