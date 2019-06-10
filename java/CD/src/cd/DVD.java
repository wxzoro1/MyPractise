package cd;

public class DVD extends Item{
	private String director;

	
	public static void main(String[] args) {
		DVD dvd = new DVD("头文字D","jayzhou", 123, "cool");
		dvd.print();
	}

	public DVD(String title, String director, int playingTime, String comment) {
		super(title, playingTime, false, comment);		//先找父类无参数的构造器 然后再自己的定义初始化 然后再自己的构造函数 false初始化gotIt
//		this.title = title;								//父类子类相同 服从子类
		setTitle("b");									//""字符串 ''char
		this.director = director;

	}

	public void print() {
		System.out.println("DVD:");
		super.print();							//调用父类print	混合使用
		System.out.println(director);		
	}
}