package clock;


public class Clock {//一个编译单元只有一个public
	private Display hour = new Display(24);	//私有是针对类的 同一类的不同对象可以互相访问
	private Display minute = new Display(60);//什么都不声明时，同一个包里可以互相访问 文件夹通过.来分级；static 类变量 类函数
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