package clock;


public class Clock {//һ�����뵥Ԫֻ��һ��public
	private Display hour = new Display(24);	//˽���������� ͬһ��Ĳ�ͬ������Ի������
	private Display minute = new Display(60);//ʲô��������ʱ��ͬһ��������Ի������ �ļ���ͨ��.���ּ���static ����� �ຯ��
	private Display second = new Display(60);
	String r = new String();
	
	public Clock(int hour, int minute, int second) {
		this.hour.value = hour;
		this.minute.value = minute;
		this.second.value = second;
		toString();
	}
	
	public void tick() {
		second.increase();
		if (second.getValue()==0) {
			minute.increase();
			if(minute.getValue()==0)
			{
			hour.increase();
			}
		}
	}
	
	public String toString() {
		r = String.format("%02d:%02d:%02d\n", hour.getValue(), minute.getValue(),second.getValue());
		return r;
	}
	
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();	
	}
}