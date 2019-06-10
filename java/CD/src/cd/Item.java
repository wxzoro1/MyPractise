package cd;

public class Item {
	private String title;						//private变 		protected 自己；同一个包其他类；子类可以访问
	private int 	playingTime;
	private boolean gotIt = false;				//默认有初始值
	private String	comment;


	public Item(String title, int playingTime, boolean gotIt, String comment) {
		super();
		this.title = title;
		this.playingTime = playingTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}
	
	public void setTitle(String title) {
		this.title = title; 
	}

	public static void main(String[] args) {
		
	}

	public void print() {
		System.out.println(title);
	}

}										//子类的对象可以赋值给父类的变量 子类的对象可以传递给需要父类对象的函数 子类的对象可以放在存放父类对象的容器里
										//java的对象变量是多态的， 可以是声明类型的对象，或是声明类型子类的对象， 把子类的对象赋给父类的变量的时候，就发生了向上造型（不需转换 永远安全）		声明类型 动态类型
										//造型cast 子类的对象赋予给父类的变量， java不存在对象给对象的赋值， 父类的对象不能赋值给子类的变量
