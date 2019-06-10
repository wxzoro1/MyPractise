package cd;
import java.util.ArrayList;

public class database {
//	private ArrayList<CD> listCD = new ArrayList<CD>();
//	private ArrayList<DVD> listDVD = new ArrayList<DVD>();
	
	private ArrayList<Item> listItem = new ArrayList<Item>();

	
//	public void add(CD cd) {								//CD像String cd像s
//		listCD.add(cd);
//	}
//	
//	public void add(DVD dvd) {								
//		listDVD.add(dvd);
//	}
	
	public void add(Item item) {							
		listItem.add(item);
	}
	
	public void list() {
//		for (CD cd : listCD) {
//			cd.print();
//		}
//		for (DVD dvd: listDVD) {
//			dvd.print();
//		}
		for (Item item: listItem) { 			//函数调用的绑定 动态绑定 静态绑定 在成员函数里调用其它成员函数也是通过this这个对象变量来调用的（琢磨琢磨也是一种动态绑定）
			item.print();						//覆盖override 子类父类完全一样 父类调用存在覆盖关系的函数时，会调用变量当时所管理的对象所属的类的函数 这就叫做多态
		}
	}
	public static void main(String[] args) {
		int i = (int)0.1;//类型转换不同于造型转换 前者发生改变 后者不变
		Item item = new Item("sd", 1, false, "23");
//		CD cd = item; //父类不能赋予给子类
//		item = cd;//子类可以赋予给父类
//		CD cc =(CD)item; //此时item里是CD对象 此办法可以通过编译且可行  否则即使通过 也会发生ClassCastException
		database db = new database();
		db.add(new CD("依然范特西","jayzhou", 11, 129, "real good"));
		db.add(new CD("摩杰座","jayzhou", 9, 119, "real real good"));
		db.add(new DVD("头文字D","jayzhou", 123, "cool"));
		db.add(new Game("q", 5, false,"a", 2));
		db.list();
		
	}

}
